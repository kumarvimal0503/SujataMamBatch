package com.core.demo.string;

public class StringDemo {

	public static void main(String[] args) {
		
		String name1 = new String("Sonali");
		
		String name2 = new String("Sonali");
		
		String name3 = "Sonali";
		
		String name4 = "Sonali";
		
		if(name1 == name2) {
			System.out.println("Name 1 and Name 2 are equal");
		} else {
			System.out.println("Name 1 and Name 2 are NOT equal");
		}
		
		
		if(name3 == name4) {
			System.out.println("Name 3 and Name 4 are equal");
		} else {
			System.out.println("Name 3 and Name 4 are NOT equal");
		}
		
		

	}

}
