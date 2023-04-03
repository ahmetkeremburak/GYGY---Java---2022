package com.turkcell.challenge09.models.dtos.student.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDto {

	private String name;
	private String studentNumber;
	private int year;
	
}
