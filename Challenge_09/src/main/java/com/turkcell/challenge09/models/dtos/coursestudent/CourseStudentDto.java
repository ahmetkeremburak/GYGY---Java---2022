package com.turkcell.challenge09.models.dtos.coursestudent;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseStudentDto {
	private String studentName;
	private String courseName;
	private String teacherName;
	private double studentNote;
}
