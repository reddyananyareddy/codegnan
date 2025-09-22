//22-09-2025
package com.codegnan.oop.overloading;

import java.util.Scanner;

public class EmployeeInfo extends Employee_01 {
	double salaryPerYear;
	public EmployeeInfo() {
		super("","",0,0);
	}
	public void inputEmployeeDetails() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee name: ");
		employeeName=sc.next();
		System.out.println("Enter years of experience: ");
		yearsOfExperience=sc.nextInt();
		System.out.println("Enter salary per year: ");
		salaryPerYear=sc.nextDouble();
		sc.close();
	}
	public void displayEmployeeInfo() {
		System.out.println("Employee name: "+employeeName);
		System.out.println("Designation: "+designation);
		System.out.println("Years of experience: "+yearsOfExperience);
		System.out.println("Salary per year: "+salaryPerYear);
	}
	public void calculateSalary() {
		double Salary=salaryPerYear*yearsOfExperience;
		System.out.println("Salary: "+Salary);
	}
}
