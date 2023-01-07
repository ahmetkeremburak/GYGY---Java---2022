package com.turkcell.challenge09.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.turkcell.challenge09.models.Course;

public interface CourseRepo extends JpaRepository<Course, Long>{

}
