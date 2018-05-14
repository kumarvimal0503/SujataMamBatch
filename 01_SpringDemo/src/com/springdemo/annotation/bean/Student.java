package com.springdemo.annotation.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	
	@Value("Vimal")
	private String name;
	
	@Autowired
	@Qualifier("getPermanentAddress")
	private Address permanentAddress;
	
	@Autowired
	private Address currentAddress;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Permanent City: "+permanentAddress.getCity());
		System.out.println("Current City: "+currentAddress.getCity());
	}
	
	@Bean
	public Address getPermanentAddress() {
		System.out.println("Bean Created::::::::");
		return new PermanentAddress();
	}
	
	
}
