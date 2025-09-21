//20-09-2025
package com.codegnan.oop.overloading;

public class Employee1 {
	String name;
	double basicSalary;
	
	public Employee1() {
		
	}
	public Employee1(String name, double basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
    }
	
	public void calSalary() {
		System.out.println("Employee Details: ");
		System.out.println("Name: "+name);
		System.out.println("Basic Salary: "+basicSalary);
	}
	
}

