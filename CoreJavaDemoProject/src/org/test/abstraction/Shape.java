package org.test.abstraction;

public abstract class Shape {
	abstract public void draw();
	
	public void doSomething() {
		
	}
}

class Rectangle extends Shape {

	@Override
	public void draw() {
		System.out.println("Draw Rectangle");
	}
	
}

class Circle extends Shape {

	@Override
	public void draw() {
		System.out.println("Draw Circle");
	}
	
}

class Art {
	
	public void fineArts(Shape shape) {
		shape.draw();
	}
	
	public static void main(String[] arts) {
		Art a = new Art();
		
		Rectangle r = new Rectangle(); 
		a.fineArts(r);
		
		Circle c = new Circle();
		a.fineArts(c);
		
	}
}



