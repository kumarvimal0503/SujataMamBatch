package com.core.demo.lamdas.methodref;

public class MethodReferenceGeneric {
	public static void main(String[]args) {
		Integer[] nums = new Integer[] {2,3,4,4,5,5};
		
		MyArrayOperation myOps = new MyArrayOperation();
		
		MyFunc<Integer> myFunc = myOps::<Integer>countMatching;
		
		calc(myFunc,nums,4);
		
		
	}
	
	static <T> void calc(MyFunc<T>myFunc,T[]vals, T val) {
		System.out.println("Occurance of "+val+" in "+vals+" is: "+myFunc.func(vals, val));
	}
}


interface MyFunc<T> {
	int func(T[] vals, T val);
}

class MyArrayOperation {
	<T> int countMatching(T[] vals, T val) {
		int count = 0;
		
		for(int i = 0; i < vals.length ; i++) {
			if(vals[i] == val) count ++;
		}
		return count;
	}
}
