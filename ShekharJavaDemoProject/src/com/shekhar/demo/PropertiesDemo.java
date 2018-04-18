package com.shekhar.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		
		//properties.load(new FileInputStream("C:/Users/Vimal/git/SujataMamBatch/ShekharJavaDemoProject/src/app.properties"));
		
		properties.load(new PropertiesDemo().getClass().getClassLoader().getResourceAsStream("/app.properties"));
		
		System.out.println("APp Name "+properties.getProperty("appName"));
		
	}

}
