package com.turkcell.challenge09.service.implementations;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.turkcell.challenge09.config.modelmapper.ModelMapperService;
import com.turkcell.challenge09.models.Teacher;
import com.turkcell.challenge09.models.dtos.teacher.request.TeacherDto;
import com.turkcell.challenge09.models.dtos.teacher.response.GetTeacherDto;
import com.turkcell.challenge09.repositories.TeacherRepo;
import com.turkcell.challenge09.service.abstracts.TeacherService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TeacherManager implements TeacherService {
	
	private final TeacherRepo repo;
	private final ModelMapperService mapper;
	
	@Override
	public List<GetTeacherDto> getAll() {
		List<Teacher> entities = repo.findAll();
		List<GetTeacherDto> dtos = entities.stream()
				.map(teacher -> mapper.toDto().map(teacher, GetTeacherDto.class))
				.collect(Collectors.toList());
		return dtos;
	}

	@Override
	public GetTeacherDto getById(long id) {
		Teacher teacher = repo.getReferenceById(id);
		GetTeacherDto dto = mapper.toDto().map(teacher, GetTeacherDto.class);
		return dto;
	}

	@Override
	public GetTeacherDto getByName(String name) {
		Teacher teacher = repo.getByName(name);
		GetTeacherDto dto = mapper.toDto().map(teacher, GetTeacherDto.class);
		return dto;
	}

	@Override
	public GetTeacherDto getByAnnoying(boolean annoying) {
		Teacher teacher = repo.getByIsAnnoying(annoying);
		GetTeacherDto dto = mapper.toDto().map(teacher, GetTeacherDto.class);
		return dto;
	}

	@Override
	public GetTeacherDto save(TeacherDto TeacherDto) {
		Teacher teacher = repo.save(mapper.toEntity().map(TeacherDto, Teacher.class));
		GetTeacherDto dto = mapper.toDto().map(teacher, GetTeacherDto.class);
		return dto;
	}

	@Override
	public GetTeacherDto update(GetTeacherDto GetTeacherDto) {
		Teacher teacher = repo.save(mapper.toEntity().map(GetTeacherDto, Teacher.class));
		GetTeacherDto dto = mapper.toDto().map(teacher, GetTeacherDto.class);
		return dto;
	}

	@Override
	public boolean delete(long id) {
		repo.deleteById(id);
		return true;
	}

}
