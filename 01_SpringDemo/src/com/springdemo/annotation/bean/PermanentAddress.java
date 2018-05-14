package com.springdemo.annotation.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("permanentAddress")
public class PermanentAddress implements Address {
	@Value("Akola")
	private String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
