package com.cognizant.springrest.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springrest.models.Country;
import com.cognizant.springrest.repositories.CountryRepository;

@Service
public class CountryService {
	@Autowired
	private CountryRepository country;
	
	public List<Country> getAll(){
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		return (List<Country>) context.getBean("countryList");
	}
	
	public Country getByCode(String code) {
		List<Country> countries = getAll();
		for(Country c: countries) {
			if(c.getCode().equalsIgnoreCase(code)) {
				return c;
			}
		}
		return null;
	}

}
