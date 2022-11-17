package com.turkcell.model;

public class Person {
	private String name;
	private String surname;
	private int personID;
	
	
	public Person(){
		
	}
	
	public Person(String name, String surname, int personID) {
		this.name = name;
		this.surname = surname;
		this.personID = personID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public int getPersonID() {
		return personID;
	}
	public void setPersonID(int personID) {
		this.personID = personID;
	}
}
