package com.shekhar.demo;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionDemo {
	public static void main(String[]rgs) {
		ArrayList<String> al = new ArrayList<>();
		
		al.add("One");
		al.add("Two");
		al.add("Three");
		al.add(2, "Two and Half");
		
		al.add(4, "Four");
		
		System.out.println(al);
		
		
		for(int i = 0 ; i < al.size() ; i++) {
			System.out.println(al.get(i));
		}
		
		int i = 0;
		for(Object o : al) {
			System.out.println(o);
		//	if( i == 2) {
		//		al.remove(i);
		//	}
			i++;
		}
		
		Iterator<String> alItr = al.iterator();
		
		while(alItr.hasNext()) {
			Object val = alItr.next();
			System.out.println(val);
			if(val.toString().equals("Two and Half")) {
				alItr.remove();
			}
		}
		
		System.out.println(al);
		
		al.forEach(o -> System.out.println(o));
		
		al.clear();
		
		System.out.println(al.size());
	}
}
