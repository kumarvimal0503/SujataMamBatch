package com.shekhar.demo;

import java.util.TreeSet;

public class TreeSetDemo3 {

	public static void main(String[] args) {

		TreeSet<Integer> numbers = new TreeSet<>();
		
		numbers.add(100);
		numbers.add(50);
		numbers.add(100);
		numbers.add(90);
		numbers.add(10);
		
		System.out.println("Size: "+numbers.size());
		System.out.println(numbers);
		
	}

}

