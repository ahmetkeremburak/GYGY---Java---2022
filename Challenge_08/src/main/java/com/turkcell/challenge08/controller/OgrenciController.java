package com.turkcell.challenge08.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turkcell.challenge08.model.Ogrenci;
import com.turkcell.challenge08.service.OgrenciService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(path = "ogrenci")
public class OgrenciController
{
	private OgrenciService service;

	@GetMapping(path = "getAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Ogrenci> getAll()
	{
		// localhost:8080/ogrenci/getAll
		return service.getAll();
	}

	@GetMapping(path = "getById/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Ogrenci> getByIdEntity(@PathVariable Long id)
	{
		// localhost:8080/ogrenci/getById/1
		return ResponseEntity.status(HttpStatus.OK).body(service.getByID(id));
	}

	// @PutMapping, @PatchMapping update için kullanılabilir
	@PostMapping(path = "save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> save(@RequestBody Ogrenci ogrenci)
	{
		// localhost:8080/ogrenci/save
		boolean result = service.save(ogrenci);
		if (result)
		{
			return ResponseEntity.status(HttpStatus.CREATED).body(ogrenci.getName() + " isimli öğrenci başarıyla kaydedildi");
		}
		else
		{
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(ogrenci.getName() + " isimli öğrenci kaydedilemedi");
		}
	}
	
	@DeleteMapping(path = "delete", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> delete(@RequestParam long ogrenciId)
	{
		// localhost:8080/ogrenci/save
		boolean result = service.delete(ogrenciId);
		if (result)
		{
			return ResponseEntity.status(HttpStatus.OK).body("öğrenci başarıyla silindi.");
		}
		else
		{
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Öğrenci silinemedi");
		}
	}
	
}
