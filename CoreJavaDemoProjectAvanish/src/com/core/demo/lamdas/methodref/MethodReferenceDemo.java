package com.core.demo.lamdas.methodref;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		
		MathUtil mathUtil = new MathUtil();
		
		doSomething(MathUtil::calculateFactorial, 5);
		
		doSomething(mathUtil::testFactor, 50,10);
	}
	
	public static void doSomething(NumericFun numericFun, int num) {
		System.out.println("Result on "+num+": "+numericFun.fun(num));
	}
	
	public static void doSomething(NumericTest2 numericFun, int num, int denom) {
		System.out.println("Result on "+num+": "+numericFun.test(num,denom));
	}
}

class MathUtil {
	public static int calculateFactorial(int num) {
		int result = 1;
		for(int i = num ; i >= 1 ;i--) {
			result *= i;
		}
		return result;
	}
	
	public boolean testFactor(int num,int denominator) {
		return num % denominator == 0;
	}
}


interface NumericTest2 {
	boolean test(int n , int d);
}

@FunctionalInterface
interface NumericFun {
	int fun(int n);
}

