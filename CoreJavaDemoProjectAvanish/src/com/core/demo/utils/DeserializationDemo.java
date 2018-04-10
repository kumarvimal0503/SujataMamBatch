package com.core.demo.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
	public static void main(String...ars) throws FileNotFoundException, IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/employee.dat"));
		
		Employee e1 = (Employee)ois.readObject();
		System.out.println(e1.getName());	
		System.out.println(e1.getEmpId());
		System.out.println(e1.getDept());
		ois.close();
	}
}
