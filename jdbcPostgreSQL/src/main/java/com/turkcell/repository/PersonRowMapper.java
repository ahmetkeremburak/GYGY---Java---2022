package com.turkcell.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.turkcell.model.Person;

public class PersonRowMapper implements RowMapper<Person> {

	@Override
	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		Person pr = new Person();
		pr.setName(rs.getString("name"));
		pr.setSurname(rs.getString("surname"));
		pr.setPersonID(rs.getInt("personID"));
		return pr;
	}

}
