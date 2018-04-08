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

class Y {
	void action() {
		
	}
}

class XImpl extends Y implements X {
	
	@Override
	public void action() {
		System.out.println("In impl");
	}

}
