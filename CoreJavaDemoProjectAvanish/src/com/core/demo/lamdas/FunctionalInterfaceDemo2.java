package com.core.demo.lamdas;

public class FunctionalInterfaceDemo2 {

	public static void main(String[] args) {
		NumericTest2 isFactor = (numerator, denominator) -> numerator % denominator == 0;
		
		System.out.println("IS Factor: "+isFactor.test(10, 2));
		
		
		NumericFun factorial = num -> {
			int result = 1;
			for(int i = num ; i >= 1 ;i--) {
				result *= i;
			}
			return result;
		};
		
		System.out.println("Factorial of 5 is: "+factorial.fun(5));
	}

}


interface NumericTest2 {
	boolean test(int n , int d);
}

interface NumericFun {
	int fun(int n);
}
