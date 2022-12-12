package com.turkcell.TeknikServis.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turkcell.TeknikServis.model.Proposal;

@Repository
public interface ProposalRepo extends JpaRepository<Proposal, Long> {
	
//	@Query(name = "findByProposalLikeName", value = "SELECT p FROM Proposal p WHERE p.SystemUser.NAME LIKE %:name%")
//	public List<Proposal> findByProposalLikeName(@Param("name")String name);

}
