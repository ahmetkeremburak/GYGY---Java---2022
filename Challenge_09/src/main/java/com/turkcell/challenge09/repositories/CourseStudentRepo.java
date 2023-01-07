package com.turkcell.challenge09.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turkcell.challenge09.models.CourseStudent;

public interface CourseStudentRepo extends JpaRepository<CourseStudent, Long> {

}
