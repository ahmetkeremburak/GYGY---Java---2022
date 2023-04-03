package com.turkcell.challenge09.config.modelmapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Configuration;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor
public class ModelMapperService {
	
	private final ModelMapper modelMapper;

	
	public ModelMapper toDto() {

		this.modelMapper.getConfiguration().setAmbiguityIgnored(true).setMatchingStrategy(MatchingStrategies.STANDARD);

		return this.modelMapper;
	}

	
	public ModelMapper toEntity() {

		this.modelMapper.getConfiguration().setAmbiguityIgnored(true).setMatchingStrategy(MatchingStrategies.STANDARD);

		return this.modelMapper;
	}
}
