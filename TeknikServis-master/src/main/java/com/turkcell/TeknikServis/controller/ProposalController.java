package com.turkcell.TeknikServis.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turkcell.TeknikServis.model.Proposal;
import com.turkcell.TeknikServis.service.ProposalService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "proposal")
@AllArgsConstructor
public class ProposalController {
	
	ProposalService service;
	
	@PostMapping(path = "create")
	public Proposal createProposal(@RequestBody Proposal proposal) {
		return service.createProposal(proposal);
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
	
	@DeleteMapping(path = "deleteById/{id}")
	public ResponseEntity<String> deleteById(@PathVariable(name = "id") Long id){
		service.deleteById(id);
		return ResponseEntity.ok("Teklif silindi.");
	}
	
	@PostMapping(path = "approveById/{id}")
	public Proposal approveById(@PathVariable(name = "id") Long id){
		return service.approved(id);
	}
}
