package com.turkcell.TeknikServis.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turkcell.TeknikServis.dto.ProposalDto;
import com.turkcell.TeknikServis.model.Proposal;
import com.turkcell.TeknikServis.service.ProposalService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "proposal")
@AllArgsConstructor
public class ProposalController {
	
	private ProposalService service;
	
	@PostMapping(path = "create", consumes = MediaType.APPLICATION_JSON_VALUE)
	public Proposal createProposal(@RequestBody ProposalDto proposalDto) {
		return service.createProposal(proposalDto);
	}
	
	@GetMapping(path = "getAll")
	public List<Proposal> getAll(){
		return service.getAll();
	}
	
	@GetMapping(path = "getById/{id}")
	public Proposal getById(@PathVariable(name = "id") Long id)
	{
		return service.getById(id);
	}
	
//	@GetMapping(path = "getByUserName/{name}")
//	public List<Proposal> getByUser(@RequestParam(name = "name") String name){
//		return service.getByUser(name);
//	}
	
	@DeleteMapping(path = "deleteById/{id}")
	public ResponseEntity<String> deleteById(@PathVariable(name = "id") Long id){
		service.deleteById(id);
		return ResponseEntity.ok("Teklif silindi.");
	}
	
	@PostMapping(path = "approve/{id}")
	public Proposal approveById(@PathVariable(name = "id") Long id){
		return service.approved(id);
	}
}
