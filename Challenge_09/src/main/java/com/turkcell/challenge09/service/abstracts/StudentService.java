package com.turkcell.challenge09.service.abstracts;

import java.util.List;

public interface StudentService {
	List<StudentDto> getAll();
	StudentDto getById(long id);
	StudentDto getByName(String name);
	StudentDto getByNumber(String number);
	StudentDto save(StudentDto studentDto);
	StudentDto update(StudentDto studentDto);
	boolean delete(StudentDto studentDto);
	
	
	
}
