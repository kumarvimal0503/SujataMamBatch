package com.springdemo.bean;

import org.springframework.beans.factory.BeanNameAware;

public class A implements BeanNameAware {
	String beanName;
	
	private B b;
	
	public A(B b) {
		System.out.println("Constructor Injection of A is called");
		this.b = b;
	}
	
	public A(B b, String name) {
		System.out.println("Constructor of 2 param Injection of A is called");
		this.b = b;
	}
	
	
	

	public void setBeanName(String beanName) {
		this.beanName = beanName;
		System.out.println("Bean Name: "+beanName);
	}
	
	
	
	public String getBeanName() {
		return beanName;
	}



	public void myInit() {
		System.out.println("Custom Init Method");
	}
}
