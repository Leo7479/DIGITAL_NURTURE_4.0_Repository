package com.cognizant.accounts.models;


public class Account {
	private String number;
	private String type;
	private float balance;
	
	public Account() {
		this.number = null;
		this.type = null;
		this.balance = 0.0f;
	}
	public Account(String number, String type, float balance) {
		this.number = number;
		this.type = type;
		this.balance = balance;
	}
	
	public String getNumber() {
		return this.number;
	}
	public String getType() {
		return this.type;
	}
	public float getBalance() {
		return this.balance;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public String toString() {
		return "Account [ Number: "+number+", Type: "+type+", Balance: "+balance+" ]";
	}

}
