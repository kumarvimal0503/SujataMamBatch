package com.springdemo.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springdemo.annotation.bean.Student;

public class StudentBeanDemo {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springAnnotation.xml");


		Student student = context.getBean(Student.class);
		
		student.display();
	}

}
