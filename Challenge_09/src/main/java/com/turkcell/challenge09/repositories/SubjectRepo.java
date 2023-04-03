package com.turkcell.challenge09.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turkcell.challenge09.models.Subject;

@Repository
public interface SubjectRepo extends JpaRepository<Subject, Long> {

}
