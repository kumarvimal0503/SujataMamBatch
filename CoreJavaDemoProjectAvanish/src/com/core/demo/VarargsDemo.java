package com.core.demo;

public class VarargsDemo {

	public static void main(String... args) {
		add(10,20);
		add(10,20,30);
		add(10,20,30,40);
		
		add("234asd");
		
	}

	
	
	public static int add(int...a) {
		int sum = 0;
		for(int num : a) {
			sum += num;
		}
		System.out.println(sum);
		
		return sum;
	}
	
	public static String add(String...s) {
		return null;
	}
	
	
}
