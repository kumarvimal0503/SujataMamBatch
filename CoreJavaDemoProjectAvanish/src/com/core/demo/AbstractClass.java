package com.core.demo;

import org.w3c.dom.views.AbstractView;

abstract public class AbstractClass {

	public static void main(String[] args) {
		System.out.println("Abstract Class");
	}

	abstract public void foo();
}

// A -> B -> C

interface j {
	static public void foo() {
		System.out.println("IN default method foo of J");
	}
}

interface k {
	static public void foo() {
		System.out.println("IN default method foo of K");
	}
}

interface I extends j,k {
	void foo();
	
}

class X implements j,k {
	
	public void doSomething() {
		j.foo();
	}
}
