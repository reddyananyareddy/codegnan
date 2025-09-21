//20-09-2025
package com.codegnan.oop.overloading;

public class Manager1 extends Employee1 {

	double bonus;
	double allowance;
	public Manager1(String name,double basicSalary,double bonus, double allowance) {
		this.name=name;
		this.basicSalary=basicSalary;
		this.bonus=bonus;
		this.allowance=allowance;
	}
	
	
	public void calSalary() {
		System.out.println("Manager Details: ");
		System.out.println("Name: "+name);
		System.out.println("Basic Salary: "+basicSalary);
		System.out.println("Bonus: "+bonus);
		System.out.println("Allowance: "+allowance);
		System.out.println("Total: "+(basicSalary+bonus+allowance));
	}

}

