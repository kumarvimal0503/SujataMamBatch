package com.demo.bean;

public class Student {
	private String name;
	private String roll;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	
}

class A {
	int GetValue()
	{
		return (true ? null : 0);
	}

	public static void main(String[] args)  {
		A obj= new A();

		obj.GetValue();
	}

}





