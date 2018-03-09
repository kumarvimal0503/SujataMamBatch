package com.indiracollege.demo.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {
	@Value("Alex")
	String name;
	
	@Autowired
	Address address;
	/**
	 * @param name
	 * @param address
	 */
	
	@Autowired
	public Student(String name, Address address) {
		this.name = name;
		this.address = address;
	}
	
	public void displayInfo() {
		System.out.println("Name: "+name);
		System.out.println("Address: "+address.city);
	}
	
}
