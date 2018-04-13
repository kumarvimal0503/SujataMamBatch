package com.core.demo.lamdas.methodref;

import java.util.Iterator;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class PredefinedFunctionalInterface {

	public static void main(String[] args) {
		
		UnaryOperator<Integer> increment = (num) -> num++;
		System.out.println("Increment: "+increment.apply(10));
		
		BinaryOperator<String> concat = (str1, str2) -> str1.concat(str2);
		
		System.out.println("Concat: "+concat.apply("James", " Bond"));
		
		Consumer<String> reverse = (str) -> {
			StringBuilder sb = new StringBuilder(str);
			System.out.println(sb.reverse());
		};
		reverse.accept("Palindrome");
		
		Function<Integer[],Integer> findEven = (arr) -> {
			int count = 0;
			for(int num : arr) {
				if(num % 2 == 0) count++;
			}
			return count;
		};
		
		System.out.println("No of Even number: "+findEven.apply(new Integer[]{10,20,30,33}));
		
		Supplier<Double> val = () -> 4.5;
		System.out.println(val.get());
		
		
		Predicate<Integer> oddEven = (num) -> num % 2 == 0;
		int num = 10;
		if(oddEven.test(num)) {
			System.out.println(num + " Even number");
		} else {
			System.out.println(num + " Odd number");
		}
		
		
		
		
		
		
		
	}

}
