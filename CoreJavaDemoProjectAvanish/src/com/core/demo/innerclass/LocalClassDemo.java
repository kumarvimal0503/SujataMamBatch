package com.core.demo.innerclass;

public class LocalClassDemo {

	public static void main(String[] args) {
		OuterClass2 outerClass2 = new OuterClass2();
		outerClass2.foo();
	}
	
}

class OuterClass2 {
	int num;
	static int data;
	
	public void foo() {
		int localVar = 10;
		class LocalClass {
			public void foo() {
				System.out.println("Local class foo()");
				System.out.println("Inclosng class num: "+num);
				System.out.println("Inclosng class static data: "+data);
				
				System.out.println("Local Var: "+localVar);
				
				//localVar += 100; Cannot change //must be final or effective final
			}
		}
		LocalClass localClass = new LocalClass();
		localClass.foo();
	}
	
}
