package org.test.inheritance;

public class MethodOverridingDemo2 {
	public static void main(String[]rgs) {
		
		Manager m1 = new Manager();
		
	}
}
class Employee {
	
	int employeeId;
	String name;
	String department;
	
	/*Employee(){
		System.out.println("In Default Constructor of Employee class");
	}*/
	
	public Employee(int employeeId, String name, String department) {
		this.employeeId = employeeId;
		this.name = name;
		this.department = department;
	}
	
	public void display() {
		System.out.println("Employee: "+ this.employeeId);
		System.out.println("Name: "+ this.name);
	}
}

class Manager extends Employee {
	String department;

	Manager() {
		super(0,null,null);
		System.out.println("In Default Constructor of Manager class");
	}
	
	public Manager(int employeeId, String name, String empDept, String mgrDept) {
		super(employeeId, name, empDept);
		this.department = mgrDept;
	}
	
	
	
	public void display(){
		super.display();
		//System.out.println("Employee Id: "+ employeeId);
		//System.out.println("Name: "+super.name);
		System.out.println("Department: "+this.department);
		System.out.println("Manger's EMployee Department: "+ super.department);
	}
	
}