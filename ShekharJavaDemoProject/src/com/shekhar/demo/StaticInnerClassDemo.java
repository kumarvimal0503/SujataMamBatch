package com.shekhar.demo;

public class StaticInnerClassDemo {
	public static void main(String[]args) {
		
		OuterClass.StaticInnerClass inner = new OuterClass.StaticInnerClass();
		inner.displayInner();
	}
}


class OuterClass {
	int x;
	static int z;
	
	static class StaticInnerClass {
		int y;
		
		public void displayInner() {
			
			System.out.println("Inner Class: "+y); // Self non static is accessible
			
			//System.out.println("Inner Class: "+x); // Outer non static is not accessible
			System.out.println("Inner Class: Z: "+z); // Outer static member is accessible
		
		}
		
	}
	
	public void static doSomething() {
		
		//System.out.println("X: "+x);
		StaticInnerClass inner = new StaticInnerClass();
		inner.displayInner();
		
		
	}
	
}