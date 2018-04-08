
public class Exception {

	public static void main(String[] args) {
		doSomething(10);
		doSomething(100);
	}
	
	
	public static void doSomething(int age) {
		assert age < 100 : age - 100;
		
		System.out.println("Age: "+age);
		
		
	}
}


