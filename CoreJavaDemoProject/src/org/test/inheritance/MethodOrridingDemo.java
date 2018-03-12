package org.test.inheritance;

public class MethodOrridingDemo {
	
}

class Car{
	
	Car drive(int a , int b) {
		System.out.println("Driving Car");
		return null;
	}
}

class Audi extends Car {
	
	 Audi drive(float a, float b) {
		System.out.println("Driving Audi car");
		return null;
	}
	
}