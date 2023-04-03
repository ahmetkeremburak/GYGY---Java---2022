package com.turkcell.challenge09.models.dtos.student.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetStudentDto {
	
	private long id;
	private String studentNumber;
	private String name;
	private int year;

}
