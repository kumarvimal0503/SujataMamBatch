
public class Hello {
	public static void main(String[]a) {
			System.out.println("Hello Java");
			
			int i = 0b111;
			
			System.out.println("i=== "+i);
			
			int o = 012;
			
			System.out.println("o===="+o);
			
		
			System.out.println("I am Git Oriented");
			
			Object o1 = new Integer("234234");
			
			
			doSomething(o1);
		
		
		
	}

	private static void doSomething(Object o1) {
		
		if(o1 instanceof Integer) {
			Integer i = (Integer) o1;
			System.out.println("I= "+i);
		}
	}
}
