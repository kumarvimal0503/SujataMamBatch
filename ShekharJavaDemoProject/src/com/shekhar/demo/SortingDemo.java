package com.shekhar.demo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingDemo {

	public static void main(String[] args) {

		Employee1 e1 = new Employee1(11, "Shekhar");
		Employee1 e2 = new Employee1(10, "Kaveri");
		Employee1 e3 = new Employee1(9, "Vimal");
		Employee1 e4 = new Employee1(8, "Vimal");
		
		List<Employee1> employees = new LinkedList<>();
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		Collections.sort(employees);
		
		System.out.println("Size: "+employees.size());
		for (Employee1 employee : employees) {
			System.out.println("Employee Id: "+employee.getEmployeeId());
			System.out.println("Employee Name: "+employee.getName());
		}
		
	}
}

class Employee1 implements Comparable<Employee1>{
	Integer employeeId;
	String name;
	public Employee1(Integer employeeId, String name) {
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
	public int compareTo(Employee1 emp) {
		
		
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


