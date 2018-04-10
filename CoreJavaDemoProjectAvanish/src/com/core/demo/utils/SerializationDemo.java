package com.core.demo.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Employee e = new Employee();
		
		e.setName("Vimal Kumar");
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:/employee.dat"));		
		
		oos.writeObject(e);
		
		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:/employee.dat"));
		
		Employee e1 = (Employee)ois.readObject();
		System.out.println(e1.getName());
		
	}

}

class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	String name;
	
	String empId;
	
	String dept;
	
	
	

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
