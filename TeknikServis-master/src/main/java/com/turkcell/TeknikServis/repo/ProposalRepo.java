package com.turkcell.TeknikServis.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turkcell.TeknikServis.model.Proposal;

@Repository
public interface ProposalRepo extends JpaRepository<Proposal, Long> {

}
