package com.core.collection.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
	public static void main(String...args) {
		List<Integer> al = new ArrayList<>(100);

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		System.out.println("Array size: "+al.size());

		int index = 2;

		Integer value = (Integer) al.get(index);
		System.out.println(value);
		
		
		for (Object object : al) {
			value = (Integer) object;
			System.out.println(value);
		}
		
		ArrayList<Integer> al2 = new ArrayList<>();
		
		al2.add(10);
		al2.add(20);
		al2.add(30);
		//al2.addAll(al);
		
		al.retainAll(al2);
		
		for (Integer value1 : al2) {
			System.out.println(value1);
		}
		
		
		Iterator<Integer> i = al.iterator();
		
		while(i.hasNext()) {
			Integer val = i.next();
			
			Integer val2 = i.next();
		}
		
		//al.trimToSize();

	}
}
