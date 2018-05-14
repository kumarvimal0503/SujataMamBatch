package com.shekhar.demo;

class PlSQL {
	
	interface X {
		void foo();
		void bar();
	}
	
	public void doSomething() {
		
		X x = new X() {
			public void foo() {
				System.out.println("In foo");
			}
			
			public void bar() {
				System.out.println("In bar");
			}
		};
		
		
		x.foo();
		x.bar();
		
		XIMpl ximple = new XIMpl();
		ximple.foo();
		ximple.bar();
		
		
	}
	
	class XIMpl implements X {
		
		public void foo() {
			System.out.println("In foo");
		}
		
		public void bar() {
			System.out.println("In bar");
		}
	}
}


