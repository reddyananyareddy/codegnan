//20-09-2025
package com.codegnan.oop.overloading;

public class Main1 {

	public static void main(String[] args) {
		Employee1 emp1=new Employee1("Employee",9000);
		emp1.calSalary();
		System.out.println();
		Employee1 emp2=new Manager1("Manager",50000,4000,2000);
		emp2.calSalary();
		

	}

}

