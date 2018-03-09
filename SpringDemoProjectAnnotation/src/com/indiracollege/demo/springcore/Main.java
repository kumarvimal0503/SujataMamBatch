package com.indiracollege.demo.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[]args) {
		ApplicationContext context 
			= new ClassPathXmlApplicationContext("spring.xml");
		
		Student stud = (Student)context.getBean("student");
		
		stud.displayInfo();
		
	}
}
