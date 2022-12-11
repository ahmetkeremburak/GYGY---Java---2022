package com.turkcell.challenge08.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.turkcell.challenge08.model.Ogrenci;
import com.turkcell.challenge08.repository.OgrenciRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OgrenciService {
	
	private OgrenciRepo repo;
	
	public List<Ogrenci> getAll(){
		return repo.getAll();
	}
	
	public Ogrenci getByID(Long id) {
		return repo.getByID(id);
	}
	
	public boolean save(Ogrenci ogrenci) {
		return repo.save(ogrenci);
	}
	
	public boolean delete(Long ogrenciId) {
		return repo.delete(ogrenciId);
	}
}
