package com.shekhar.demo.lambdas;

public class MethodReferenceDemo {
	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}
	public static void main(String...ars) {
		String input = "Lambdas";
		MyStringOps myStringOps = new MyStringOps();
		String outpur = stringOp(myStringOps::strReverse, input);
		System.out.println(outpur);
	}
}

interface StringFunc {
	String func(String n);
}

class MyStringOps {
	String strReverse(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
	
	String strReverse1(String str) {
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
}

