package com.core.demo.string;

public class StringDemo2 {

	public static void main(String[] args) {

		String name = "A quick brown fox jumps over the lazy dog";
		
		byte[] nameArray = name.getBytes();
		
		char [] buff = new char[name.length()];
		
		name.getChars(18, name.length(), buff, 0);
		System.out.println(buff);
		
		System.out.println(name.toCharArray());
		
		String firstName = "Alex";
		String lastName = "Hales";
		
		String fullName = firstName.concat(lastName);
		
		System.out.println(fullName);
		
		fullName = fullName.toUpperCase();
		
		System.out.println(fullName);
		
		System.out.println("Length: "+fullName.length());
		
		System.out.println(name.charAt(name.indexOf("z")));
		
		
		
		String animal1 = "Hippo";
		String animal2 = "hippo";
		
		System.out.println(animal1.equals(animal2));
		
		System.out.println(animal1.equalsIgnoreCase(animal2));
		
		String subStr = name.substring(0,5);
		
		String substr2 = name.substring(0);
		
		System.out.println(subStr );
		System.out.println(substr2 );
		
		System.out.println(name.replaceAll("dog", "cat"));
		
		System.out.println(name.contains("quick fox"));
		System.out.println(name.contains("brown fox"));
		
		
	}

}
