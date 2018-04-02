package com.core.multithreading;

public class DeadLockDemo {
	public static void main(String[]args) {
		Object r1 = new Object();
		Object r2 = new Object();
		
		MyThread1 t1 = new MyThread1(r1, r2);
		MyThread1 t2 = new MyThread1(r2, r1);
		
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		
		t1.start();
		t2.start();
		
		
	}
}


class MyThread1 extends Thread {
	Object r1;
	Object r2;
	
	public MyThread1(Object r1, Object r2) {
		this.r1 = r1;
		this.r2 = r2;
	}
	
	public void run() {
			System.out.println(Thread.currentThread().getName()+": Going to lock R1");
		synchronized (r1) {
			System.out.println(Thread.currentThread().getName()+": Locked R1");
			System.out.println(Thread.currentThread().getName()+": Going to lock R2");
			synchronized (r2) {
				System.out.println(Thread.currentThread().getName()+": Locked R2");	
			}
		}
	}
}

