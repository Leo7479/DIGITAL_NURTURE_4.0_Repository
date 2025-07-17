package com.cognizant.spring_learn;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	public static void displayDate() {
		ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
		SimpleDateFormat dateFormat = (SimpleDateFormat) context.getBean("dateFormat");
		try {
			System.out.println(dateFormat.parse("31/12/2025"));
		} catch (ParseException e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		LOGGER.info("Started Main");
		ApplicationContext context = SpringApplication.run(SpringLearnApplication.class, args);
		displayDate();
		LOGGER.info("End of Main");
	}

}
