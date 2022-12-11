package com.turkcell.challenge08.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.turkcell.challenge08.model.Ogrenci;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class OgrenciRepo {
	
	private JdbcTemplate jdbcTemplate;
	
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public List<Ogrenci> getAll(){
		List<Ogrenci> liste;
		String sql = "SELECT * FROM \"obsh\".\"ogrenci\"";
		RowMapper<Ogrenci> rowMapper = new RowMapper<Ogrenci>() {

			@Override
			public Ogrenci mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				return new Ogrenci(rs.getLong(1), rs.getString("name"), rs.getLong("ogrnumber"), rs.getLong("year"));
			}	
		};
		liste = jdbcTemplate.query(sql, rowMapper);
		return liste;
	}
	
	public Ogrenci getByID(long id) {
		String sql = "SELECT * FROM \"obsh\".\"ogrenci\" WHERE\"id\" = :ID";
		RowMapper<Ogrenci> rowMapper = new RowMapper<Ogrenci>() {
			
			@Override
			public Ogrenci mapRow(ResultSet rs, int rowNum) throws SQLException {
				
				return new Ogrenci(rs.getLong(1), rs.getString("NAME"), rs.getLong("OGRNUMBER"), rs.getLong("YEAR"));
			}
		};
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("ID", id);
		return namedParameterJdbcTemplate.queryForObject(sql, paramMap, rowMapper);
	}
	
	public boolean save(Ogrenci ogrenci) {
		
		String sql = "insert into obsh.ogrenci (name,ogrnumber,year) values (:name,:ogrnumber,:year)";
		Map<String, Object> paramMap = new HashMap();
		paramMap.put("name", ogrenci.getName());
		paramMap.put("ogrnumber", ogrenci.getOgrnumber());
		paramMap.put("year", ogrenci.getYear());
		return namedParameterJdbcTemplate.update(sql, paramMap) == 1;
	}
	
	public boolean delete(long ogrenciId) {
		String sql = "delete from obsh.ogrenci where id = :id";
		Map<String, Object> paramMap = new HashMap<>();
		paramMap.put("id", ogrenciId);
		return namedParameterJdbcTemplate.update(sql, paramMap) == 1;
	}
}