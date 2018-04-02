package com.core.demo;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello");
		foo();
		
		
		
		int b = 0b1010;
		
		System.out.println("Byte b= "+b);
		
		int o = 024;
		
		System.out.println("Octal o= "+o);
		
		int h = 0xFFFF;
		System.out.println(" Hexa h= "+h);
		
		
		
	}
	
	
	
	public static void foo() {
		System.out.println("In Method");
	}
}
