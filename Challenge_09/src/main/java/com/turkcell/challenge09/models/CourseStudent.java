package com.turkcell.challenge09.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseStudent {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "student")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Student student;
	
	@ManyToOne
	@JoinColumn(name = "course")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Course course;
	
	@Column(name = "studentNote")
	private double studentCourseNote;
}
