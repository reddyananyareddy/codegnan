//24-09-2025
package com.codegnan.oop.overriding;

import java.util.Objects;

public class Student {
	String name;
	int rollNumber;
	
	public Student(String name, int rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
//	public String toString() {
//		return "Name: "+name+", Roll Number: "+rollNumber;
//	}
	//we can't write for every variable so we use shortcut given below
	//right click -> source -> Generate toString()
	
//		@Override
//		public String toString() {
//			return "Student [name=" + name + ", rollNumber=" + rollNumber + "]";
//		}
	
	public static void main(String[] args) {
		Student s1=new Student("s1",1);
		Student s2=new Student("s2",2);
		Student s3=new Student("s1",1);
		Student s4=s1;
//		System.out.println(s1.toString());
//		System.out.println(s1);
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equals(s3));//false //true after over writing the .equals()
		System.out.println(s1.equals(s4));//true
		
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, rollNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && rollNumber == other.rollNumber;
	}

}
