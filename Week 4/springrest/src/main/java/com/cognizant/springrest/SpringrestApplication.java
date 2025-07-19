package com.cognizant.springrest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.springrest.models.Country;

@SpringBootApplication
public class SpringrestApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringrestApplication.class);
	
	public static void displayCountry() {
		LOGGER.info("Inside displayCountry()");
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		Country country = (Country) context.getBean("countryIN");
		LOGGER.debug("Country: {}", country);
	}
	
	public static void main(String[] args) {
		LOGGER.info("Started Main");
		SpringApplication.run(SpringrestApplication.class, args);
		displayCountry();
		LOGGER.info("End of Main");
	}

}
