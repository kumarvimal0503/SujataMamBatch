package com.core.demo.lamdas;

public class GenericFunctionlIntefaceDemo {

	public static void main(String[] args) {

		SomeFunc<Integer> findFactorial = (num) -> {
			int result = 1;
			for(int i = num ; i >= 1 ;i--) {
				result *= i;
			}
			return result;
		};
		
		System.out.println("Factorial of 5: "+findFactorial.func(5));
		
		SomeFunc<String> findReverse = (text) -> {
			StringBuffer sb = new StringBuffer(text);
			return sb.reverse().toString();
		};
		
		System.out.println("Reverse of 'Lambda': "+findReverse.func("Lambda"));
		
		doSomething((text) -> {
			StringBuffer sb = new StringBuffer(text);
			return sb.reverse().toString();
		}, "Lambda");
		
	}
	
	static void doSomething(SomeFunc<String> func,String text) {
		System.out.println("Reverse of 'Lambda': "+func.func(text));
	}

}

interface SomeFunc<T> {
	T func(T t);
}





