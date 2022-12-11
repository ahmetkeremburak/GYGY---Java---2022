package com.turkcell.challenge08.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.turkcell.challenge08.model.Ders;
import com.turkcell.challenge08.model.DersDTO;
import com.turkcell.challenge08.model.Ogretmen;
import com.turkcell.challenge08.repository.DersRepo;
import com.turkcell.challenge08.repository.OgretmenRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class DersService{
	
	private DersRepo repo;

	public List<Ders> getAll()
	{
		return repo.getAll();
	}

	public List<DersDTO> getAllDTO()
	{
		return repo.getAllDTO();
	}
	
	public Ders getByID(long id)
	{
		return repo.getById(id);
	}

	public boolean save(Ders ders)
	{
		try
		{
			return repo.save(ders);
		}
		catch (Exception e)
		{
			return false;
		}
	}
}
