package com.shekhar.demo;

import java.util.ArrayList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		
		System.out.println(al.get(2));
		
		Integer data = 10;
		
		System.out.println(al.remove(data));
		
		System.out.println(al);

	}

}
