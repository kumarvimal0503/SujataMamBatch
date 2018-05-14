package com.springdemo.bean;

import javax.annotation.PostConstruct;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class BeanLifeCycleDemo 
		//implements
		/*BeanNameAware, 
		BeanFactoryAware,
		ApplicationContextAware,
		BeanPostProcessor,
		InitializingBean*/ {
	
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	
	
	/*BeanLifeCycleDemo() {
		System.out.println("Bean Instantiation");
	}
	
	public void setData(String data) {
		this.data =data;
		System.out.println("Populating Properties");
	}

	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean name set: "+beanName);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("Bean Factory: "+((AddOperation)beanFactory.getBean("addOpr")).getNum1());
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("Application Context: "+((AddOperation)applicationContext.getBean("addOpr")).getNum1());
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Post Process Before Initialization: "+beanName);
		return bean;
	}
	

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("After Property Set");
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Post Process After Initialization: "+beanName);
		return bean;
	}
	

	
	
	*/
	public void myInit() {
		System.out.println("Custom Init Method");
	}

	
	public void destroy() {
		System.out.println("destroy");
	}
	
	
	
	
	
	
	
	
	
	
}