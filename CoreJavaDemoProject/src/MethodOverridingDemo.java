
public class MethodOverridingDemo {
	
	public static void main(String[]args) {
		Override override = new Override();
		
		override.sum(10, 20);
		override.sum(10, 20, 30);
		override.sum(10L, 20L);
		 
	}
	
	
}

class Override {
	
	public void sum(int a , int b){
		System.out.println(a+b);
	}
	
	
	public void sum(int a , int b, int c) {
		System.out.println(a+b+c);
	}
	
	public void sum(double a, double b) {
		System.out.println("Double version called");
		System.out.println(a+b);
	}
	public void sum(Object a, Object b) {
		System.out.println("Object version called");
		System.out.println(Integer.parseInt(String.valueOf(a))+Integer.parseInt(String.valueOf(b)));
	}
	
	
}
