package org.test.abstraction;

public class InterfaceDemo {

	public static void main(String[] args) {
		X x = new XImpl();
		x.action();
	}

}

interface X {
	int a = 5;
	void action();
}

interface Y extends X{
	int doSomething();
}

class XImpl implements X {
	public void action() {
		System.out.println("In impl");
	}
}
