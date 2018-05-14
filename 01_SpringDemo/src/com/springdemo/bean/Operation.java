package com.springdemo.bean;
public class Operation {
	private AddOperation addOperation;
	
	public Operation(AddOperation addOperation) {
		this.addOperation = addOperation;
	}
	
	
	public void doSomething() {
		System.out.println("Addition Operation on 10 and 20: "+addOperation.add());
	}
}
