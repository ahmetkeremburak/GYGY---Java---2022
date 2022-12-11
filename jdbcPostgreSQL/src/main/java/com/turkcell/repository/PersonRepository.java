package com.turkcell.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.turkcell.model.Person;

public class PersonRepository {

	@Autowired
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public boolean save(Person person) {

		String sql = "insert into Person (name) values (:name)";		
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("name", person.getName());
		return namedParameterJdbcTemplate.update(sql, paramMap) == 1;
	}

	public boolean update(Person person) {
		String sql = "update person set name = :name where id = :id";		
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("id", person.getPersonID());
		paramMap.put("name", person.getName());
		return namedParameterJdbcTemplate.update(sql, paramMap) == 1;

	}

	public boolean deleteById(int personId) {
		String sql = "delete from person where id = :id";
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("id", personId);
		return namedParameterJdbcTemplate.update(sql, paramMap) == 1;
	}

	public ArrayList<Person> getAll() {
		String sql = "select * from person";
		ArrayList<Person> list = (ArrayList<Person>) namedParameterJdbcTemplate.query(sql, new PersonRowMapper());
		return list;
	}

	public Person getById(int personId) {
		String sql = "select * from person where id=:id";
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("id", personId);
		try {
			Person person= (Person) namedParameterJdbcTemplate.queryForObject(sql, paramMap, new PersonRowMapper());
			return person;
		} catch (Exception e) {
			return null;
		}
		
	}
}
