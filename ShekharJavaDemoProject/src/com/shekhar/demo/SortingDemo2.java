package com.shekhar.demo;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class SortingDemo2 {

	public static void main(String[] args) {

		Employee2 e1 = new Employee2(11, "Shekhar");
		Employee2 e2 = new Employee2(10, "Kaveri");
		Employee2 e3 = new Employee2(9, "Vimal");
		Employee2 e4 = new Employee2(8, "Vimal");

		List<Employee2> employees = new LinkedList<>();

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);

		Collections.sort(employees, new Comparator<Employee2>(){ ;
		@Override
		public int compare(Employee2 emp1, Employee2 emp2) {

			return emp1.getEmployeeId().compareTo(emp2.getEmployeeId());

			/*if(emp1.getEmployeeId() < emp2.getEmployeeId()){
				return -1;
			} else if(emp1.getEmployeeId() > emp2.getEmployeeId()) {
				return 1;
			} else {
				return 0;	
			}*/
		}
		});
		
		//Collections.sort(employees,(emp1,emp2) -> emp1.getEmployeeId().compareTo(emp2.getEmployeeId()));

		System.out.println("Size: "+employees.size());
		for (Employee2 employee : employees) {
			System.out.println("Employee Id: "+employee.getEmployeeId());
			System.out.println("Employee Name: "+employee.getName());
		}

	}
}

class SortEmp implements Comparator<Employee2> {
	@Override
	public int compare(Employee2 emp1, Employee2 emp2) {

		return emp1.getEmployeeId().compareTo(emp2.getEmployeeId());

		/*if(emp1.getEmployeeId() < emp2.getEmployeeId()){
			return -1;
		} else if(emp1.getEmployeeId() > emp2.getEmployeeId()) {
			return 1;
		} else {
			return 0;	
		}*/
	}
}

class Employee2{
	Integer employeeId;
	String name;
	public Employee2(Integer employeeId, String name) {
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
	/*	public int compareTo(Employee2 emp) {


		return this.getEmployeeId().compareTo(emp.getEmployeeId());

		if(this.getEmployeeId() < emp.getEmployeeId()){
			return -1;
		} else if(this.getEmployeeId() > emp.getEmployeeId()) {
			return 1;
		} else {
			return 0;	
		}
	}
	 */	


}


