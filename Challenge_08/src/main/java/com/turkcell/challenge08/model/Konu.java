package com.turkcell.challenge08.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Konu {

	private long konuId;
	private String konuName;
	
	public Konu(String kONUNAME) {
		this.konuName = kONUNAME;
	}
	
}
