import java.io.IOError;

public class MethodOrridingDemo2 {
	public static void main(String[]args) {
		X x = new  Y();
		Y y = new Y(); 
		try {
		//x.foo();
		}catch(Exception e){}
		
		//y.foo();
	}
}


class X {
	private void foo() {
		
	}
}

class Y extends X {
	
	private void foo() {
		
	}
}