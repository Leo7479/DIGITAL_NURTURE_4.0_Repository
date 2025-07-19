package com.cognizant.springrest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springrest.models.Country;
import com.cognizant.springrest.services.CountryService;

@RestController
public class CountryController {
	private final CountryService countryService;
	private final ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
	@Autowired
	public CountryController(CountryService countryService) {
		this.countryService = countryService;
	}
	
	@RequestMapping("/country")
	public Country getCountryIndia() {
		return (Country) context.getBean("countryIN");
	}
	
	@RequestMapping("/countries")
	public List<Country> getAllCountries(){
		return countryService.getAll();
	}
	
	@GetMapping("/country/{code}")
	public Country getCountry(@PathVariable("code") String code) {
		return countryService.getByCode(code);
	}
}
