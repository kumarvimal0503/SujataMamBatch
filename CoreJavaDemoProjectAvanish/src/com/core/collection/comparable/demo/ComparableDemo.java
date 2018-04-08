package com.core.collection.comparable.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {
		
		List<Employee> ts1 = new ArrayList<>();
		Employee e1 = new Employee(20);
		Employee e2 = new Employee(30);
		Employee e3 = new Employee(10);
		Employee e4 = new Employee(40);
		Employee e5 = new Employee(40);
		
		ts1.add(e1);
		ts1.add(e2);
		ts1.add(e3);
		ts1.add(e4);
		ts1.add(e5);
		
		System.out.println(ts1.size());
		System.out.println(ts1);
		
		Collections.sort(ts1);
		
		System.out.println(ts1);
	}
}

class MyComparator implements Comparator<Employee> {
	public int compare(Employee e1, Employee e2) {
		return e1.empId.compareTo(e2.empId);
	}
}

class Employee implements Comparable<Employee>{
	Integer empId;

	
	
	public Employee(Integer empId) {
		super();
		this.empId = empId;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + "]";
	}

	@Override
	public int compareTo(Employee emp) {
		return this.empId.compareTo(emp.empId);
	}
	
	
	
}

