//04-11-2025
package com.codegnan.iostreams;

import java.io.Serializable;

public class Employee implements Serializable {
	int empId;
	String empName;
	double empSalary;
	String empLocation;
	
	

	public Employee(int empId, String empName, double empSalary, String empLocation) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empLocation = empLocation;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empLocation="
				+ empLocation + "]";
	}
	
	public void displayEmployeeDetails() {
		System.out.println("Employee ID: "+empId);
		System.out.println("Employee name: "+empName);
		System.out.println("Employee Salary: "+empSalary);
		System.out.println("Employee Location: "+empLocation);
	}
	
	

}
