package com.springdemo.demo;

import java.util.List;
import java.util.Map.Entry;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.springdemo.bean.A;
import com.springdemo.bean.Student;
import com.springdemo.bean.Subject;

public class OperationDemo {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("spring.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		//Operation operation = (Operation) context.getBean("operation");
		
		//Operation operation1 = (Operation) context.getBean("operation");
		
		//System.out.println("Both Instance are equal: "+ (operation == operation1));
		
		//operation.doSomething();
		
		
		Student student = (Student) context.getBean("student");
		
		List<String> emails = student.getEmails();
		
		for (String email : emails) {
			System.out.println("email: "+email);
		}
		
		student.getaList()
			.stream()
			.map(a -> a.getBeanName())
			.forEach(beanName -> System.out.println(beanName));
		
		
		student.getSubjectNames().forEach(System.out::println);
		
		student.getSubjects().stream().map(Subject::getSubjectName).forEach(System.out::println);
		
		
		student.getMarks().entrySet().forEach(entry -> {
			
		System.out.print("Subject Name: "+entry.getKey());
		System.out.println("    Marks: "+entry.getValue());
		});
		
		student.getMarks().entrySet().forEach(OperationDemo::displayMarks);
		
		
		System.out.println("Month: Jan: Attendance: "+student.getAttendenceDetails().get("jan"));
		System.out.println("Month: Feb: Attendance: "+student.getAttendenceDetails().get("feb"));
		System.out.println("Month: Mar: Attendance: "+student.getAttendenceDetails().get("mar"));
	}

	public static void displayMarks(Entry<String, Double> entry) {
		System.out.print("Subject Name: "+entry.getKey());
		System.out.println("   Marks: "+entry.getValue());
	}
	
}
