package com.turkcell.challenge08.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class BeanFactory {
	
	@Bean(name = "dataSource")
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://localhost:5432/OBS");
		dataSource.setUsername("postgre");
		dataSource.setPassword("01234567");
		return dataSource;
	}
	
	@Bean(name = "jdbcTemplate")
	@DependsOn(value = "dataSource")
	@Autowired
	public JdbcTemplate jdbcTemplate(@Qualifier("dataSource") DataSource ds) {
		return new JdbcTemplate(ds);
		
	}
	
	@Bean(name = "namedParameterJdbcTemplate")
	@DependsOn(value = "dataSource")
	@Autowired
	public NamedParameterJdbcTemplate namedJdbcTemplate(@Qualifier("dataSource") DataSource ds) {
		return new NamedParameterJdbcTemplate(ds);
		
	}
	
}
