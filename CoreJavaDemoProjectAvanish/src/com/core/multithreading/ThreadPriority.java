package com.core.multithreading;

public class ThreadPriority {

	public static void main(String[] args) {

		MyThread mt1 =  new MyThread();
		MyThread mt2 =  new MyThread();
		
		mt1.setPriority(Thread.MIN_PRIORITY);
		mt2.setPriority(Thread.MAX_PRIORITY);
		
		mt1.start();
		mt2.start();
		
		mt1.tStop();
		mt2.tStop();
		
		System.out.println("Counter value of first thread: "+mt1.counter);
		System.out.println("Counter value of Second thread: "+mt2.counter);
		
	}

}

class MyThread extends Thread {
	long counter;
	boolean flag = true;
	
	public void run() {
		while(flag) {
			counter++;
		}
	}
	
	public void tStop() {
		flag = false;
	}
}