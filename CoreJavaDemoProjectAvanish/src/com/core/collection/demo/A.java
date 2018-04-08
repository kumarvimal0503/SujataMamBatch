package com.core.collection.demo;

public class A <T> {
	T x;
	T y;
	
	public void foo() {
		
		if(x instanceof String || y instanceof String) {
			System.out.println(((String)x + (String)y));	
		} else {
			System.out.println(((int)x + (int)y));
		}
	}
	
	public static void main(String[]rgs) {
		A<String> a = new A<>();
		
		a.x = "Alex";
		a.y = "Parker";
		
		a.foo();

		
		A<Integer> a1 = new A<>();
		
		a1.x = 100;
		a1.y = 200;
		
		a1.foo();
		
	}
}
