package com.shekhar.demo;

public class A<T> {
	T data1;
	T data2;
	
	public A(T data1, T data2) {
		this.data1 = data1;
		this.data2 = data2;
	}
	
	public void sum(){
		
		if(data1 instanceof Integer && data2 instanceof Integer) {
			System.out.println(((int)data1 + (int)data2));	
		} else if(data1 instanceof String && data2 instanceof String) {
			System.out.println(((String)data1 + (String)data2));
		} else if(data1 instanceof Double && data2 instanceof Double){
			System.out.println(((double)data1 + (double)data2));
		}
		
		
	}
	
	public static void main(String[]rgs) {
		A<Integer> a = new A<>(10, 20);
		a.sum();
		
		A<String> a1 = new A<>("Shekhar","Pande");
		a1.sum();
		
		A<Double> a2 = new A<>(500.2, 333.2);
		a2.sum();
	}
}

