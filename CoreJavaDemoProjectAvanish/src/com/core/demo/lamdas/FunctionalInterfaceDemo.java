package com.core.demo.lamdas;

public class FunctionalInterfaceDemo {
	public static void main(String[]args) {
		X x1 = () -> System.out.println("Hi There");
		
		X x2 = () -> System.out.println("Hi Lambdas");
		
		x1.fun();
		
		x2.fun();
		
		
		NumTest findEven = num -> num % 2 == 0;
		
		if(findEven.test(10)) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");
		}
		
		NumTest findNonNeg = num -> num > 0;
		
		System.out.println("Is negative: "+findNonNeg.test(-10));
		
		
		
	}
}


@FunctionalInterface
interface X {
	void fun();
}

@FunctionalInterface
interface Y {
	void someFun();
}

@FunctionalInterface
interface NumTest {
	boolean test(int num);
}