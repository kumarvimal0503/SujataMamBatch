package com.indiracollege.demo.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("address")
public class Address {
	
	@Value("Pune")
	String city;
	
	String addressLine;
	
	
	
	
	@Autowired
	public void setAddressLine(@Value("Vakad Road") 
	String addressLine) {
		this.addressLine = addressLine;
	}




	public Address(String city) {
		this.city = city;
	}
	
	
}
