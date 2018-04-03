package com.core.demo.innerclass;

public class AnonymousDemo {
	public static void main(String[]ars) {
		
		Runnable r = new Runnable() {
			
			public void run() {
				System.out.println("In Run Block");
			}
			
		};
		
		new AnonymousDemo();
		
		Runnable r1 = new Runnable() {
			
			public void run() {
				System.out.println("In Run Block");
			}
			
		};
		
		
		Thread t  = new Thread(r);
		t.start();
		
	}
}
