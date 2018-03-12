
public class SingletonDemo {
	private static SingletonDemo obj;
	int x;
	private SingletonDemo(){}
	public static SingletonDemo getInstance(){
		if(obj == null){
			obj = new SingletonDemo();
		}
		return obj;
	}
	
}

class Main1 {
	public static void main(String[]args){
		SingletonDemo s1 = SingletonDemo.getInstance();
		s1.x = 5;
		
		SingletonDemo s2 = SingletonDemo.getInstance();
		s2.x = 10;
		
		
		System.out.println("S1.x = "+s1.x);
		
		System.out.println("S2.x = "+s2.x);
		
		
	}
}
