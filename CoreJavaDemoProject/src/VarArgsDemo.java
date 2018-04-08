
public class VarArgsDemo {
	public static void main(String[]args) {
		System.out.println(add(10));
		System.out.println(add(10,20));
		System.out.println(add(10,20,30));
		
	}
	
	
	public static int add(float f , int...i) {
		int sum = 0;
		
		for (int num : i) {
			sum += num;
		}
		return sum;
	}
	
	public static float add(float f) {
		return f;
	}
}

class Main2 {  
    public static void var(Integer x) {  
        System.out.println("Integer int");  
    }  


    public static void var(int... x) {  
        System.out.println("int... x");  
    }  

    public static void var(Integer... x) {  
        System.out.println("Integer...");  
    }  

    public static void main(String... args) {   
        byte i = 0;  
        int in = 10;
        Integer i2 = 127;  
        var(in);  
    }  
} 
