package com.core.multithreading;

public class JoinDemo {

	public static void main(String[] args) {
		J1 j1 = new J1();
		J1 j2 = new J1();
		J1 j3 = new J1();
		
		Thread t1 = new Thread(j1);
		Thread t2 = new Thread(j2);
		Thread t3 = new Thread(j3);
		
		t1.setName("T1");
		t2.setName("T2");
		t3.setName("T3");
		
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		t2.start();
		t3.start();
		
		System.out.println("Main Exits");
		
		
	}

}

class J1 implements Runnable {
	
	public void run() {
		for(int i = 1 ; i < 5 ; i++) {
			System.out.println(Thread.currentThread().getName()+"i= "+i);
		}
	}
	
}
