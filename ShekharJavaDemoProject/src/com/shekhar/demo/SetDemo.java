package com.shekhar.demo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> numbers = new HashSet<>();
		int num = 10;
		numbers.add(num);
		numbers.add(5);
		numbers.add(2);
		numbers.add(4);
		numbers.add(4);
		numbers.add(7);
		numbers.add(9);
		numbers.add(23);
		
		Integer i = new Integer(50);
		Integer i2 = new Integer(50);
		
		numbers.add(i);
		numbers.add(i2);
		
		
		System.out.println("SIze of the HashSet: "+numbers.size());
		
		System.out.println(numbers);
		
		
	}

}
