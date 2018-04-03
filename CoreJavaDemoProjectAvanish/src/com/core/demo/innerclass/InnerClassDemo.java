package com.core.demo.innerclass;

public class InnerClassDemo {

	public static void main(String[] args) {

		OuterClass.NestedClass nestedClass = new OuterClass.NestedClass();
		
		nestedClass.foo();
		
		
	}

}

class OuterClass {
	static int num;
	int data;
	
	static class NestedClass {
		static int num;//This is not shadowing
		public void foo() {
			System.out.println("Static Innner Class");
			
			System.out.println("Num: "+OuterClass.num); // static member accessible
			System.out.println("Num: "+NestedClass.num);
			
			// System.out.println("Data: "+data); Non static member not accessible
		}
	}
	
}
