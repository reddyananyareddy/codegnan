//22-09-2025
package com.codegnan.oop.overloading;

public class EmployeeDetails {

	public static void main(String[] args) {
		EmployeeInfo info=new EmployeeInfo();
		info.inputEmployeeDetails();
		info.displayEmployeeInfo();
		info.calculateSalary();

	}

}


//EXAMPLE PROBLEM
//you are tasked with creating a simple calculator application that performs addition and multiplication operations.
//Define base class Calculation with a constructor that takes 2 parameters. Implement a method addition in Calculation class.
//The addition method perform sum of 2 parameters that are passed in constructor and return their sum.
//		
//Create a child class My_Calculation that inherits from the Calculation class. In the child class, 
//implement a method multiplication that returns the product of the 2 parameters that are inherited from the base class.