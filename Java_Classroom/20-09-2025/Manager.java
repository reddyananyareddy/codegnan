//20-09-2025
package com.codegnan.oop.overloading;

public class Manager extends Employee {

	String dept;
	public Manager(String name,double salary,String dept) {
		this.name=name;
		this.salary=salary;
		this.dept=dept;
	}
	
	//overriding
	public void displayDetails() {
		System.out.println("Manager Details: ");
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Department: "+dept);
	}

}

