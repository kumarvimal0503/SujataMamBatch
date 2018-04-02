package com.core.collection.demo;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<Student> hs1 = new HashSet<>();

		Student s1 = new Student(20);
		Student s2 = new Student(30);
		Student s3 = new Student(10);
		Student s4 = new Student(40);
		Student s5 = new Student(40);

		hs1.add(s1);
		hs1.add(s2);
		hs1.add(s3);
		hs1.add(s4);
		hs1.add(s5);
		
		System.out.println(hs1.size());
		System.out.println(hs1);
	}
}

class Student {
	int studentId;

	public Student(Integer studentId) {
		super();
		this.studentId = studentId;
	}

	

	public int getStudentId() {
		return studentId;
	}



	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}



	@Override
	public String toString() {
		return "Student [studentId=" + studentId + "]";
	}
	
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof Student) {
			return this.studentId == ((Student)o).getStudentId();
		} else {
			return false;
		}
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + studentId;
		return result;
	}
	
	
	
	
	
}