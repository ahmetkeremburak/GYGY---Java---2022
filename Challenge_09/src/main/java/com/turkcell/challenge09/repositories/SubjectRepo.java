package com.turkcell.challenge09.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turkcell.challenge09.models.Subject;

public interface SubjectRepo extends JpaRepository<Subject, Long> {

}
