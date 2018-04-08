package com.core.multithreading;

public class SynchronizationDemo {
	public static void main(String[]args) {
		Account a = new Account();
		
		User user1 = new User(a,500);
		User user2 = new User(a,500);
		
		Thread t1 = new Thread(user1);
		Thread t2 = new Thread(user2);
		
		t1.setName("Rohan");
		t2.setName("Alex");
		
		t1.start();
		t2.start();
	}
}



class User implements Runnable {
	
	Account account;
	int required;
	
	User(Account account,int required) {
		this.account = account;
		this.required = required;
	}
	@Override
	public void run() {
		
		synchronized (account) {
			account.reserve(required);			
		}
	}
}

class Account {
	int balance = 500;
	
	public void reserve(int required) {
		System.out.println(Thread.currentThread().getName()+": Available "+balance);
		
		if(balance >= required) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			balance -= required;
		}
		System.out.println(Thread.currentThread().getName()+"  : Remaining "+balance);
	}
}





