package com.core.demo.lamdas.methodref;

import java.util.Arrays;
import java.util.List;

public class StreamCollectDemo {
	public static void main(String[] args) {
	    List<String> list = Arrays.asList("Mukesh", "Vishal", "Amar");
	    String result = list.stream().collect(StringBuilder::new,
	    		(response, element) -> response.append(" ").append(element),
	    		(response1, response2) -> response1.append(",").append(response2.toString()))
	    		.toString();
	    System.out.println("Result: " + result);
	}
} 
