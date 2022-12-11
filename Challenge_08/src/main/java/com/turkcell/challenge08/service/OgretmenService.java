package com.turkcell.challenge08.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.turkcell.challenge08.model.Ogretmen;
import com.turkcell.challenge08.repository.OgretmenRepo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OgretmenService
{
	private OgretmenRepo repo;

	public List<Ogretmen> getAll()
	{
		return repo.getAll();
	}
	
	public Ogretmen getByID(long id)
	{
		return repo.getById(id);
	}

	public boolean save(Ogretmen ogretmen)
	{
		try
		{
			return repo.save(ogretmen);
		}
		catch (Exception e)
		{
			System.err.println(e.getMessage());
			return false;
		}
	}
}
