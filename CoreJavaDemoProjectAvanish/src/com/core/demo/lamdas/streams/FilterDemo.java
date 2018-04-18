package com.core.demo.lamdas.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FilterDemo {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		numbers.add(100);
		numbers.add(200);
		numbers.add(300);
		numbers.add(400);
		numbers.add(500);
		numbers.add(600);
		
		System.out.println("After Basic Filter: ");
		for (Integer number : numbers) {
			if(number < 500) {
				System.out.println(number);
			}
		}
		
		System.out.println("After Stream Filter: ");
		
		
		//TO get a stream from collection
		Stream<Integer> stream = numbers.stream();
		
		
		//TO filter the stream
		Stream<Integer> filteredStream = stream.filter((num) -> num < 500);
		
		//To iterate over the stream using lambda body
		//filteredStream.forEach(num -> System.out.println(num));
		
		//to iterate over the stream using method reference
		filteredStream.forEach(System.out::println);
		
		
		//To convert stream into collection
		List<Integer> filteredList = filteredStream.collect(Collectors.toList());
		
		for (Integer integer : filteredList) {
			System.out.println(integer);
		}
		
		
		
		
	}

}
