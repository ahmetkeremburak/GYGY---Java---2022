package com.turkcell.challenge09.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.turkcell.challenge09.models.Teacher;

//@Repository
public interface TeacherRepo extends JpaRepository<Teacher, Long> {

	Teacher getByName(String name);

	Teacher getByIsAnnoying(boolean annoying);

}
