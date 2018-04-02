package com.core.multithreading;

public class FirstThread {

	public static void main(String[] args) {
		
		MyJob j1 = new MyJob();
		MyJob j2 = new MyJob();
		
		Thread t1 = new Thread(j1);
		Thread t2 = new Thread(j2);
		
		t1.setName("Michale");
		t2.setName("Jackson");
		
		t1.start();
		t2.start();
	}

}

class MyJob implements Runnable {

	@Override
	public void run() {
		
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println(Thread.currentThread().getName()+ ": "+i);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}


