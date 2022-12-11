package com.turkcell.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turkcell.model.Person;
import com.turkcell.repository.PersonRepository;

@RestController
@RequestMapping(path = "person")
public class PersonController {
	
	@Autowired
	public PersonRepository repo;


	@PostMapping(path = "save", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> save(@RequestBody Person person){
		if(repo.save(person)) {
			return ResponseEntity.status(HttpStatus.CREATED).body(person.getName() + person.getSurname() + "has been saved");
		}
		else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Something's wrong, I can feel it.");
		}
	}
	
	@GetMapping(path = "getAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Person> getAll(){
		return repo.getAll();
	}
	
	@PostMapping(path = "update", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> update(@RequestBody Person person){
		if(repo.update(person)) {
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(person.getName() + person.getSurname() + "has been updated");
		}
		else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to update, you win this time Doctor");
		}
	}
	
	@DeleteMapping(path = "deleteByID", consumes = MediaType.APPLICATION_JSON_VALUE )
	public ResponseEntity<String> deleteById(@RequestParam int personId){
		if(repo.deleteById(personId)) {
			return ResponseEntity.status(HttpStatus.OK).body("Number " + personId + "has been deleted");
		}
		else {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to destroy person");
		}
	}
	
	public Person getById(@RequestParam int personId) {
		return repo.getById(personId);
	}
	
}
