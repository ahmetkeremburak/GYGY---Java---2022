package com.turkcell.challenge09.service.implementations;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.turkcell.challenge09.config.modelmapper.ModelMapperService;
import com.turkcell.challenge09.models.Student;
import com.turkcell.challenge09.models.dtos.student.request.StudentDto;
import com.turkcell.challenge09.models.dtos.student.response.GetStudentDto;
import com.turkcell.challenge09.repositories.StudentRepo;
import com.turkcell.challenge09.service.abstracts.StudentService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentManager implements StudentService{

	private final StudentRepo repo;
	private final ModelMapperService mapper;
	
	
	@Override
	public List<GetStudentDto> getAll() {
		List<Student> entities = repo.findAll();
		List<GetStudentDto> dtos = entities.stream()
				.map(student -> mapper.toDto().map(student, GetStudentDto.class))
				.collect(Collectors.toList());
		
		return dtos;
	}

	@Override
	public GetStudentDto getById(long id) {
		Student student = repo.getReferenceById(id);
		
		GetStudentDto studentDto = mapper.toDto().map(student, GetStudentDto.class);
		
		return studentDto;
	}

	@Override
	public GetStudentDto getByName(String name) {
		Student student = repo.getReferenceByName(name);
		
		GetStudentDto studentDto = mapper.toDto().map(student, GetStudentDto.class);
		
		return studentDto;
	}

	@Override
	public GetStudentDto getByNumber(String number) {
		Student student = repo.getReferenceByStudentNumber(number);
		
		GetStudentDto studentDto = mapper.toDto().map(student, GetStudentDto.class);
		
		return studentDto;
	}

	@Override
	public GetStudentDto save(StudentDto studentDto) {
		
		Student student = repo.save(mapper.toEntity().map(studentDto, Student.class));
		GetStudentDto dto = mapper.toDto().map(student, GetStudentDto.class);
		return dto;
	}

	@Override
	public GetStudentDto update(GetStudentDto getStudentDto) {
		Student student = repo.save(mapper.toEntity().map(getStudentDto, Student.class));
		GetStudentDto dto = mapper.toDto().map(student, GetStudentDto.class);
		return dto;
	}

	@Override
	public boolean delete(long id) {
		repo.deleteById(id);
		return true;
	}
	
}
