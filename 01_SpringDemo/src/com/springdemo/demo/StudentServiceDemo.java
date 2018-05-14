package com.springdemo.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.annotation.bean.StudentService;

public class StudentServiceDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springAnnotation.xml");
		
		
		StudentService service = context.getBean(StudentService.class);
		
		service.saveStudent();
		
		
		StudentService service2 = context.getBean(StudentService.class);
		
		if(service == service2) {
			System.out.println("Equal Singleton Service Objects");
		}
		
		if(service.getStudent() == service2.getStudent()) {
			System.out.println("Equal Prototype Student Objects");
		} else {
			System.out.println("Un Equal Prototype Student Objects");
		}
	}

}
