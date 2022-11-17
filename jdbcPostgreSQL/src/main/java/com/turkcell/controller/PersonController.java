package com.turkcell.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.turkcell.model.Person;
import com.turkcell.repository.PersonRepository;

@RestController
public class PersonController {
	
	@Autowired
	public PersonRepository rep;

	@PostMapping(path = "save")
	public void save(@RequestBody Person person)
	{
		
	}
}
