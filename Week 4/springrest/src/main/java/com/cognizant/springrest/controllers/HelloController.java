package com.cognizant.springrest.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/hello")
public class HelloController {
	@GetMapping
	public String sayHello() {
		return "Hello World";
	}
	
}
