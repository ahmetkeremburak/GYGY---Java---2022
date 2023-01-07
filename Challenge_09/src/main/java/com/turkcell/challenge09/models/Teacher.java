package com.turkcell.challenge09.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column( name = "name" ,length = 100)
	private String name;
	
	@Column(name = "annoyingness")
	private boolean isAnnoying;
	
	public Teacher(String name, boolean annoying) {
		this.name = name;
		this.isAnnoying = annoying;
	}
}
