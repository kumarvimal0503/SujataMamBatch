package com.shekhar.demo;

public class InnerClassDemo {
	public static void main(String[]args) {
		
		Outer out = new Outer();
		
		out.x = 10;
		
		out.displayOuter();
		
		Outer.Inner inner = out.new Inner();
		
		inner.x = 20;
		
		inner.displayInner();
		
	}
}


class Outer {
	int x;
	static int z;
	
	class Inner {
		int y;
		int x;
		static int name;
		public void p() {
			System.out.println("In Display Inner: ");
			
			Outer o1 = new Outer();
			
			System.out.println("Value of Outer class in inner X: "+Outer.this.x);
			System.out.println("Value of Inner class X: "+x);
			
			System.out.println("Value of Outer class z: "+z);
		}
	}
	
	public void displayOuter() {
		System.out.println("Outer class X: "+x);
	}
}