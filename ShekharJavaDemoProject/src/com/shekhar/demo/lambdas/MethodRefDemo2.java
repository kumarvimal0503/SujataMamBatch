package com.shekhar.demo.lambdas;

public class MethodRefDemo2 {
	static boolean tempOp(StringFunc1 sf, String ht1, String ht2) {
		return sf.func(ht1,ht2);
	}
	public static void main(String...ars) {
		//HighTemp ht1 = new HighTemp(40);
		//HighTemp ht2 = new HighTemp(30);
		
		String s1 = "H1";
		String s2 = "H2";
		boolean result = tempOp(HighTemp::sameTemp, s1, s2);
		System.out.println(result);
	}
}

interface StringFunc1 {
	boolean func(String ht1, String ht2);
}

class HighTemp {
	String temp;
	
	public HighTemp(String temp) {
		super();
		this.temp = temp;
	}

	boolean sameTemp(String ht) {
		return temp.equals(ht);
	}
	
}

