package com.turkcell.challenge08.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Ogrenci {

	private long id;
	
	private String name;
	
	private long ogrnumber;
	
	private long year;
	
	public Ogrenci(String namE, long ogrnumbeR, int yeaR) {
		this.name = namE;
		this.ogrnumber = ogrnumbeR;
		this.year = yeaR;
	}
	
}
