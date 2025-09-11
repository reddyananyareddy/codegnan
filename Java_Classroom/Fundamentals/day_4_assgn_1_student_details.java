//23-08-2025
/*1.Write a Java program to display student details.
     Name(string)
     Roll Number(int)
     Age(int)
     Grade(string)
     Then print all the student details in a clear format.  
*/   

package com.codegnan.fundamentals;

import java.util.Scanner;
public class day_4_assgn_1_student_details {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name=sc.next();
		int rollNumber=sc.nextInt();
		int age=sc.nextInt();
		String grade=sc.next();
		System.out.println("Student Details: ");
		System.out.println("Name: "+name);
		System.out.println("RollNumber: "+rollNumber);
		System.out.println("Age: "+age);
		System.out.println("Grade: "+grade);
		sc.close();
	}
}

