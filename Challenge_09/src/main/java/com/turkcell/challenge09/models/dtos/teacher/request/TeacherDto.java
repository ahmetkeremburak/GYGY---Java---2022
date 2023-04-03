package com.turkcell.challenge09.models.dtos.teacher.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TeacherDto {
	
	private String name;
	private boolean isAnnoying;
	
}
