package com.turkcell.TeknikServis.dto;

import com.turkcell.TeknikServis.model.Product;
import com.turkcell.TeknikServis.model.SystemUser;

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
public class ProposalDto {
	
	private SystemUser user;
	
	private Product product;

	private double price;
	
	private String note;
}
