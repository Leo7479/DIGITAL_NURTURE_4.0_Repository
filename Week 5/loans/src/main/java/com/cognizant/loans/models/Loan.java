package com.cognizant.loans.models;

public class Loan {
	private String number;
	private String type;
	private long loan;
	private long emi;
	private int tenure;
	
	public Loan() {
		this.number = null;
		this.type = null;
		this.loan = 0L;
		this.emi = 0L;
		this.tenure = 0;
	}
	public Loan(String number, String type, long loan, long emi, int tenure) {
		this.number = number;
		this.type = type;
		this.loan = loan;
		this.emi = emi;
		this.tenure = tenure;
	}
	
	public String getNumber() {
		return this.number;
	}
	public String getType() {
		return this.type;
	}
	public long getLoan() {
		return this.loan;
	}
	public long getEmi() {
		return this.emi;
	}
	public int getTenure() {
		return this.tenure;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setLoan(long loan) {
		this.loan = loan;
	}
	public void setEmi(long emi) {
		this.emi = emi;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	@Override
	public String toString() {
		return "Loan [number=" + number + ", type=" + type + ", loan=" + loan + ", emi=" + emi + ", tenure=" + tenure
				+ "]";
	}
	
	
}

