package com.core.demo;

import java.util.ArrayList;
import java.util.Collection;

public class StaticDemo {

	public static void main(String[] args) {
		System.out.println(A.x);
		
		
		A a2 = new A ();

		A a3 = new A ();
		
		Collection<Object> c = new ArrayList<>();
	}

}

class A {
	static int x;
	int y;
	static {
		System.out.println("Static Block");
	}
	
	A ()  {
		System.out.println("Constructor Block");
	}
	
	{
		System.out.println("Code Block: "+y);
		
	}
}
