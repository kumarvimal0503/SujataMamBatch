package com.core.demo;

public class WrapperClassDemo {
	public static void main(String[]args) {
		
		foo(10L);
		
	}
	
	public static void foo(Long l) {
		System.out.println("Wrapper Long version");
	}
	
	public static int foo(long l) {
		System.out.println("Primitive Long version");
		return 0;
	}
}
