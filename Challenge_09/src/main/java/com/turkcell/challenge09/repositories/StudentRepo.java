package com.turkcell.challenge09.repositories;

import com.turkcell.challenge09.models.Student;

import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

	Student getReferenceByName(String name);

	Student getReferenceByStudentNumber(String number);
	
	void deleteById(Long id);
	

}
