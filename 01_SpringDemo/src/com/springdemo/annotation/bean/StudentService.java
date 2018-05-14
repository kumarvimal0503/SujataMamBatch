package com.springdemo.annotation.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class StudentService implements ApplicationContextAware {
	
	//@Autowired
	//private ObjectFactory<Student> studentFactory;
	
	@Autowired
	private Student student;
	
	private ApplicationContext context;
	
	
	public Student getStudent() {
		//return (Student)context.getBean("student");
		//return studentFactory.getObject();
		return student;
	}
	public void saveStudent(){
		
		System.out.println("Student Save: "+getStudent().getName());
	}
	@Override
	public void setApplicationContext(ApplicationContext arg0) throws BeansException {
		this.context = arg0;
	}
	
	
	
	
}
