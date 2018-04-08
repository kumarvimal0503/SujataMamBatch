package com.core.demo.innerclass;

public class InnerClassDemo2 {

	public static void main(String[] args) {
		
		OuterClass1 outerClass = new OuterClass1(100);
		
		OuterClass1.InnerClass innerClass = outerClass.new InnerClass(50);
		
		innerClass.foo();
	}
}

class OuterClass1 {
	int data;
	
	OuterClass1 (int data) {
		this.data = data;
	}
	
	class InnerClass {
		int data;
		//static int num; //Illegal
		public InnerClass(int data) {
			this.data = data;
		}
		public void foo() {
			System.out.println("Non Static Innner Class ");
			
			System.out.println("Outer class data access: "+OuterClass1.this.data);
			
			System.out.println("Inner class data access: "+this.data);
		} 
	}
	
	public void display () {
		InnerClass innerClass = new InnerClass(4);
		innerClass.foo();
	}
	
	
}
