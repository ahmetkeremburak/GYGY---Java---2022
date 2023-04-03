package com.turkcell.challenge09.service.abstracts;

import java.util.List;

import com.turkcell.challenge09.models.dtos.coursestudent.CourseStudentDto;
import com.turkcell.challenge09.models.dtos.coursestudent.GetCourseStudentDto;

public interface CourseStudentService {
	List<GetCourseStudentDto> getAll();
	GetCourseStudentDto getById(Long id);
	GetCourseStudentDto save(CourseStudentDto student);
	GetCourseStudentDto update(GetCourseStudentDto student);
	boolean delete(Long id);
}
