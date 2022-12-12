package com.turkcell.TeknikServis.service;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Service;

import com.turkcell.TeknikServis.dto.ProposalDto;
import com.turkcell.TeknikServis.model.Proposal;
import com.turkcell.TeknikServis.repo.ProposalRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProposalService {

	private ProposalRepo repo;
	private EntityManager entityManager;
	
	public List<Proposal> getAll() {
		return repo.findAll();
	}

	public void deleteById(Long id) {
		repo.deleteById(id);;
	}

	public Proposal getById(Long id) {
		return repo.findById(id).get();
	}

	public Proposal approved(Long id) {
		Proposal prop = getById(id);
		prop.setApproved(true);
		Proposal prop1 = repo.save(prop);
//		entityManager.clear();
//		prop = repo.findById(id).get();
		return prop1;
	}

	public Proposal createProposal(ProposalDto proposalDto) {
		Proposal prop = new Proposal();
		prop.setUser(proposalDto.getUser());
		prop.setProduct(proposalDto.getProduct());
		prop.setPrice(proposalDto.getPrice());
		prop.setNote(proposalDto.getNote());
		prop = repo.saveAndFlush(prop);
		entityManager.clear();
		prop = repo.findById(prop.getId()).get();
//		prop = repo.getReferenceById(prop.getId());
		return prop;
	}

//	public List<Proposal> getByUser(String name) {
//		return repo.findByProposalLikeName(name);
//	}
//	
	public List<Proposal> getByUser(String name) {
		return repo.findByUser_NAME(name);
	}
}
