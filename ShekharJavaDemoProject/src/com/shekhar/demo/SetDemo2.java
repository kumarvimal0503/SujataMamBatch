package com.shekhar.demo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo2 {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Shekhar");
		Student s2 = new Student(1, "Shekhar");
		Student s3 = new Student(2, "Kaveri");
		
		Set<Student> studetns = new HashSet<>();
		studetns.add(s1);
		studetns.add(s2);
		studetns.add(s3);
				
		for (Student student : studetns) {
			System.out.println("Roll NO:" + student.getRollNo());
			System.out.println("Name:" + student.getName());
			System.out.println("======================================");
		}
			
		
		
	}

}

class Student {
	int rollNo;
	String name;
	
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {

		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Student) {
			Student student = (Student) o;
			return this.rollNo == student.rollNo; 
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		return rollNo;
	}
	
}

