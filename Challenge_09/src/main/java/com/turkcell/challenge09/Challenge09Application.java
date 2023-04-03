package com.turkcell.challenge09;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Challenge09Application {

	public static void main(String[] args) {
		SpringApplication.run(Challenge09Application.class, args);
		
		
		}
	
	@Bean
	public ModelMapper getModelMapper() {
		return new ModelMapper();
	}
}

