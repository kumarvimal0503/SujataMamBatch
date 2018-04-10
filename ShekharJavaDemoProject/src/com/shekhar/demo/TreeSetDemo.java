package com.shekhar.demo;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {

		TreeSet<Integer> numbers = new TreeSet<>();
		
		numbers.add(100);
		numbers.add(50);
		numbers.add(100);
		numbers.add(90);
		numbers.add(10);
		
		System.out.println("Size: "+numbers.size());
		System.out.println(numbers);
		
		
		SortedSet<Integer> headNumbers = numbers.headSet(60);
		
		for (Integer number : headNumbers) {
			System.out.println(number);
		}
		
		System.out.println("================================================");
		SortedSet<Integer> headNumbersDesc = numbers.descendingSet();
		
		for (Integer number : headNumbersDesc) {
			System.out.println(number);
		}
	}

}

