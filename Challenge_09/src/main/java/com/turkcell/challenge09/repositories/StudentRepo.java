package com.turkcell.challenge09.repositories;

import org.springframework.stereotype.Repository;

import com.turkcell.challenge09.models.Student;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

}
