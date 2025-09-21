//20-09-2025
package com.codegnan.oop.overloading;

public class Developer extends Employee {
	String progLang;

	public Developer(String name,double salary,String progLang) {
		this.name=name;
		this.salary=salary;
		this.progLang=progLang;
	}

	public void displayDetails() {
		System.out.println("Manager Details: ");
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
		System.out.println("Programming Language: "+progLang);
	}

}
