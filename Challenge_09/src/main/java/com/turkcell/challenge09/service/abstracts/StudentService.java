package com.turkcell.challenge09.service.abstracts;

import java.util.List;

import com.turkcell.challenge09.models.dtos.student.request.StudentDto;
import com.turkcell.challenge09.models.dtos.student.response.GetStudentDto;

public interface StudentService {
	List<GetStudentDto> getAll();
	GetStudentDto getById(long id);
	GetStudentDto getByName(String name);
	GetStudentDto getByNumber(String number);
	GetStudentDto save(StudentDto studentDto);
	GetStudentDto update(GetStudentDto GetStudentDto);
	boolean delete(long id);
}
