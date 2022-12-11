package com.turkcell.TeknikServis.service;

import java.util.List;
import org.springframework.stereotype.Service;

import com.turkcell.TeknikServis.model.Proposal;
import com.turkcell.TeknikServis.repo.ProposalRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProposalService {

	ProposalRepo repo;
	
	public List<Proposal> getAll() {
		// Yapılan tüm teklifleri listeler
		return repo.findAll();
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);;
	}

	public Proposal getById(Long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	public Proposal approved(Long id) {
		Proposal prop = getById(id);
		prop.setApproved(true);
		repo.save(prop);
		return repo.getReferenceById(id);
	}

	public Proposal createProposal(Proposal proposal) {
		return repo.saveAndFlush(proposal);
//		return repo.getReferenceById(proposal.getId());
	}

}
