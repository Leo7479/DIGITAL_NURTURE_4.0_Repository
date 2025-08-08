package com.cognizant.loans.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loans.models.Loan;

@RestController
@RequestMapping("/loans")
public class LoanController {
	@GetMapping("/{number}")
	public Loan getLoanDetails(@PathVariable("number") String number) {
		return new Loan(number, "car", 400000, 3258, 18);
	}
}
