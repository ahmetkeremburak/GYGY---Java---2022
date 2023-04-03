package com.turkcell.challenge09.models.dtos.teacher.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetTeacherDto {
	
	private long id;
	private String name;
	private boolean isAnnoying;
	
}
