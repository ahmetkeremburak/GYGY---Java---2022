package com.turkcell.challenge09.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turkcell.challenge09.models.dtos.student.request.StudentDto;
import com.turkcell.challenge09.models.dtos.student.response.GetStudentDto;
import com.turkcell.challenge09.service.abstracts.StudentService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "obs/student")
@RequiredArgsConstructor
public class StudentController {
	
	private final StudentService service;
	
	@GetMapping(path = "all")
	public ResponseEntity<List<GetStudentDto>> getAll(){
		return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
	}
	
	@PostMapping(path = "save")
	public ResponseEntity<GetStudentDto> save(@RequestBody StudentDto student){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(student));
	}
	
	@GetMapping(path = "id")
	public ResponseEntity<GetStudentDto> getById(@RequestParam(name = "id") long id){
		return ResponseEntity.status(HttpStatus.OK).body(service.getById(id));
	}
	
	@GetMapping(path = "name")
	public ResponseEntity<GetStudentDto> getByName(@RequestParam(name = "name") String name){
		return ResponseEntity.status(HttpStatus.OK).body(service.getByName(name));
	}
	
	@GetMapping(path = "number")
	public ResponseEntity<GetStudentDto> getByNumber(@RequestParam(name = "number") String number){
		return ResponseEntity.status(HttpStatus.OK).body(service.getByNumber(number));
	}
	
	@PutMapping(path = "update")
	public ResponseEntity<GetStudentDto> update(@RequestBody GetStudentDto dto){
		return ResponseEntity.status(HttpStatus.OK).body(service.update(dto));
	}
	
	@DeleteMapping(path = "delete")
	public ResponseEntity<Boolean> delete(@RequestParam(name = "id") long id){
		return ResponseEntity.status(HttpStatus.OK).body(service.delete(id));
	}
}
