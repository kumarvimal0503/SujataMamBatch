
public class StaticDemo {
	static int a;
	
	static {
		System.out.println("Static Block loaded");
	}
}

class  Main {
	public static void main(String[]args) {
		
		System.out.println("a= "+StaticDemo.a);
		
		System.out.println("a= "+StaticDemo.a);
		
	}
}


