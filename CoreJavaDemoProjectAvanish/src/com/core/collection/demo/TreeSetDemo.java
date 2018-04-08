package com.core.collection.demo;

import java.util.TreeSet;

/**
 * 
 * @author Vimal
 *
 */
public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> ts = new TreeSet<>();
		
		ts.add(10);
		ts.add(2);
		ts.add(10);
		ts.add(20);
		
		System.out.println(ts);
		
		
		Employee e1 = new Employee(20);
		Employee e2 = new Employee(30);
		Employee e3 = new Employee(10);
		Employee e4 = new Employee(40);
		Employee e5 = new Employee(40);
		
		
		TreeSet<Employee> ts1 = new TreeSet<>();
		
		ts1.add(e1);
		ts1.add(e2);
		ts1.add(e3);
		ts1.add(e4);
		ts1.add(e5);
		
		System.out.println(ts1.size());
		System.out.println(ts1);
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
	public int compareTo(Employee emp) {
		return this.empId.compareTo(emp.getEmpId());
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + "]";
	}
	
	
	
}
