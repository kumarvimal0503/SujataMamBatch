package org.test.inheritance2;

import org.test.inheritance.A;

public class B extends A {
	
	public void foo() {
		doSomething();
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		
		b.foo();
		b.doSomething();
		
		
		
		A a1 = new A();
		
		
		A aPointB = new B();
		
		B b1 = new B();
		
		if(a1 instanceof A){
			System.out.println("a1 instanceof A");
		}
		
		if(aPointB instanceof A){
			System.out.println("aPointB instanceof A");
		} else {
			System.out.println("aPointB NOT AN instanceof A");
		}
		
		if(aPointB instanceof B){
			System.out.println("aPointB instanceof B");
		} else {
			System.out.println("aPointB NOT AN instanceof B");
		}
		
		if(a1 instanceof B) {
			System.out.println("a1 instanceof B");
		} else {
			System.out.println("a1 NOT AN instanceof B");
		}
		
		if(b1 instanceof A) {
			System.out.println("b1 instanceof A");
		} else {
			System.out.println("b1 NOT AN instanceof ");
		}
		
			
		
	}
}


