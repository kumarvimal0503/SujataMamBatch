package com.shekhar.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		
		HashMap<String,String> studentInfo = new HashMap<>();
		
		studentInfo.put("name", "Vimal");
		studentInfo.put("roll", "120");
		studentInfo.put("email", "vimal@x.com");
		
		
		System.out.println("Name: "+studentInfo.get("name"));
		
		
		System.out.println("=========================================");
		Set<String> keySet = studentInfo.keySet();
		
		for (String key : keySet) {
			System.out.println(key+ ": "+studentInfo.get(key));
		}
		System.out.println("=========================================");
		
		Collection<String> values = studentInfo.values();
		
		for (String value : values) {
			System.out.println(value);
		}
		System.out.println("=========================================");
		Set<Entry<String,String>> entrySet = studentInfo.entrySet();
		
		for (Entry<String, String> entry : entrySet) {
			System.out.println(entry.getKey()+":  "+entry.getValue());
		}
				
		System.out.println("=========================================");
	}

}
