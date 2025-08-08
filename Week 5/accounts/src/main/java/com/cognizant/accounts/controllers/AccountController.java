package com.cognizant.accounts.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.accounts.models.Account;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	@GetMapping("/{number}")
	public Account getAccountDetails (@PathVariable("number") String number) {
		return new Account(number, "savings", 10200.00f);
	}
}
