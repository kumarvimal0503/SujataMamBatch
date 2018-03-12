package org.test.inheritance;

public class CloneableDemo {

	public static void main(String[]args) {
		
		Foo foo = new Foo();
		foo.x = 1000;
		
		Bar b = new Bar();
		b.y = 100;
		b.foo = foo;
		System.out.println(b);

		Bar b2 = new Bar();
		b2 = b.clone();
		System.out.println("Before changing B2: " + b2);
		b2.y = 200;
		b2.foo.x = 1100;
		System.out.println("AFter changing B2: "+b2);
		
		System.out.println("Originnal Value of B:"+b);

	}
}

class Foo implements Cloneable{
	int x;

	
	public Foo clone() {
		try {
			return (Foo) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	@Override
	public String toString(){
		return "X="+x;
	}
}

class Bar implements Cloneable {
	int y;
	Foo foo;

	public Bar clone()  { 
		try {
			
			Bar bCloned = (Bar)super.clone();
			Foo fCloned = foo.clone();
			bCloned.foo = fCloned;
			return bCloned;
		} catch(CloneNotSupportedException c ) {
			c.printStackTrace();
			return null;
		}
	}


	@Override
	public String toString(){
		return "Y="+y+", Foo.x = "+foo.x;
	}
}