package com.core.demo.utils;

public class CloneDemo {

	public static void main(String[] args) {
		Address add = new Address("Pune");
		
		Student s1 = new Student(100,add);
		
		Student s2 = s1.getClone();
		
		s2.setRollNo(60);
		
		s2.getAddress().setCity("Mumbai");
		
		
		System.out.println("S1 Roll= "+s1.getRollNo());
		System.out.println("S1 Addres = "+s1.getAddress().getCity());
		
		System.out.println("S2 Roll=    "+s2.getRollNo());
		System.out.println("S2 Address= "+s2.getAddress().getCity());
		
		
		
		
		
	}

}

class Student implements Cloneable{
	int rollNo;
	Address address;
	
	public Student(int rollNo, Address address) {
		super();
		this.rollNo = rollNo;
		this.address = address;
	}
	
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public Student getClone() {
		try {
			Address clonedAddress = this.getAddress().getClone();
			Student student = (Student) super.clone();
			student.setAddress(clonedAddress);
			return student;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
}

class Address implements Cloneable{
	String city;

	public Address(String city) {
		super();
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	public Address getClone() {
		try {
			return (Address) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
}
