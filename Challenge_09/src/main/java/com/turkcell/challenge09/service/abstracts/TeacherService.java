package com.turkcell.challenge09.service.abstracts;

import java.util.List;

import com.turkcell.challenge09.models.dtos.teacher.request.TeacherDto;
import com.turkcell.challenge09.models.dtos.teacher.response.GetTeacherDto;

public interface TeacherService {
	List<GetTeacherDto> getAll();
	GetTeacherDto getById(long id);
	GetTeacherDto getByName(String name);
	GetTeacherDto getByAnnoying(boolean annoying);
	GetTeacherDto save(TeacherDto TeacherDto);
	GetTeacherDto update(GetTeacherDto GetTeacherDto);
	boolean delete(long id);
}
