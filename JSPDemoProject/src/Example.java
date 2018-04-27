
public class Example {
	public static void main(String...args) {
		B b = new B(); 
	}
}

class A {
	A() {
		System.out.println("A");
		display();
	}
	public void display() {
		System.out.println("IN Class A display");
	}
}
class B extends A {
	B() {
		System.out.println("B");
	}
	public void display() {
		System.out.println("IN Class B Display");
	}
}
