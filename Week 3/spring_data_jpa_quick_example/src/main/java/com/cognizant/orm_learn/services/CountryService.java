package com.cognizant.orm_learn.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.orm_learn.models.Country;
import com.cognizant.orm_learn.repositories.CountryRepository;

import jakarta.transaction.Transactional;

@Service
public class CountryService {

	private CountryRepository countryRepo;
	
	@Autowired
	public CountryService(CountryRepository countryRepo) {
		this.countryRepo = countryRepo;
	}
	
	@Transactional
	public List<Country> getAllCountries(){
		return countryRepo.findAll();
	}
}
