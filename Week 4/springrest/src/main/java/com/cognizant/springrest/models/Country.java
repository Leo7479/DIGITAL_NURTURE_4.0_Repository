package com.cognizant.springrest.models;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="country")
public class Country {
	private static final Logger LOGGER = LoggerFactory.getLogger(Country.class);
	
	@Id
	@Column(name="code")
	private String code;
	@Column(name="name")
	private String name;
	
	public Country() {
		this.code=null;
		this.name=null;
		LOGGER.debug("Inside the non-parameterized constructor");
	}
	public Country(String code, String name) {
		this.code = code;
		this.name = name;
		LOGGER.debug("Inside the parametrized constructor");
	}
	public String getCode() {
		LOGGER.debug("Inside the getCode() method");
		return this.code;
	}
	public void setCode(String code) {
		LOGGER.debug("Inside the setCode() method");
		this.code = code;
	}
	public String getName() {
		LOGGER.debug("Inside the getName() method");
		return this.name;
	}
	public void setName(String name) {
		LOGGER.debug("Inside the setName() method");
		this.name = name;
	}
	public String toString() {
		return "Country [ Code: "+this.code+", Name: "+this.name+" ]";
	}
}
