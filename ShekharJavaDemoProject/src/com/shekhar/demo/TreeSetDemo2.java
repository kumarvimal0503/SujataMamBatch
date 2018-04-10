package com.shekhar.demo;

import java.util.TreeSet;

public class TreeSetDemo2 {
	public static void main(String[] args) {

		Employee e1 = new Employee(11, "Shekhar");
		Employee e2 = new Employee(10, "Kaveri");
		Employee e3 = new Employee(9, "Vimal");
		Employee e4 = new Employee(8, "Vimal");
		
		TreeSet<Employee> employees = new TreeSet<>();
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		System.out.println("Size: "+employees.size());
		for (Employee employee : employees) {
			System.out.println("Employee Id: "+employee.getEmployeeId());
			System.out.println("Employee Name: "+employee.getName());
		}
		
	}
}

class Employee implements Comparable<Employee>{
	Integer employeeId;
	String name;
	public Employee(Integer employeeId, String name) {
		super();
		this.employeeId = employeeId;
		this.name = name;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Employee emp) {
		
		
		return this.getEmployeeId().compareTo(emp.getEmployeeId());
		
		/*if(this.getEmployeeId() < emp.getEmployeeId()){
			return -1;
		} else if(this.getEmployeeId() > emp.getEmployeeId()) {
			return 1;
		} else {
			return 0;	
		}*/
	}
	
	
	
}

