package com.core.demo.lamdas;

public class VariableCaptureDemo {

	public static void main(String[] args) {
		A a = new A();
		a.some();
	}

}

class A {
	public void some() {
		int num = 0;
		MyFunc myFunc = (n) -> {
			int v = num + n;
			//num++;
			return v;
		};
		
		myFunc.func(5);
	}
	
	public void foo() {
		System.out.println("In Foo()");
	}
}

interface MyFunc {
	int func(int n);
}
