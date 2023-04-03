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

import com.turkcell.challenge09.models.dtos.teacher.request.TeacherDto;
import com.turkcell.challenge09.models.dtos.teacher.response.GetTeacherDto;
import com.turkcell.challenge09.service.abstracts.TeacherService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path = "obs/teacher")
@RequiredArgsConstructor
public class TeacherController {
	private final TeacherService service;
	
	@GetMapping(path = "all")
	public ResponseEntity<List<GetTeacherDto>> getAll(){
		return ResponseEntity.status(HttpStatus.OK).body(service.getAll());
	}
	
	@PostMapping(path = "save")
	public ResponseEntity<GetTeacherDto> save(@RequestBody TeacherDto teacher){
		return ResponseEntity.status(HttpStatus.CREATED).body(service.save(teacher));
	}
	
	@GetMapping(path = "id")
	public ResponseEntity<GetTeacherDto> getById(@RequestParam(name = "id") long id){
		return ResponseEntity.status(HttpStatus.OK).body(service.getById(id));
	}
	
	@GetMapping(path = "name")
	public ResponseEntity<GetTeacherDto> getByName(@RequestParam(name = "name") String name){
		return ResponseEntity.status(HttpStatus.OK).body(service.getByName(name));
	}
	
	@GetMapping(path = "number")
	public ResponseEntity<GetTeacherDto> getByAnnoying(@RequestParam(name = "annoying") boolean isAnnoying){
		return ResponseEntity.status(HttpStatus.OK).body(service.getByAnnoying(isAnnoying));
	}
	
	@PutMapping(path = "update")
	public ResponseEntity<GetTeacherDto> update(@RequestBody GetTeacherDto dto){
		return ResponseEntity.status(HttpStatus.OK).body(service.update(dto));
	}
	
	@DeleteMapping(path = "delete")
	public ResponseEntity<Boolean> delete(@RequestParam(name = "id") long id){
		return ResponseEntity.status(HttpStatus.OK).body(service.delete(id));
	}
	
	
}
