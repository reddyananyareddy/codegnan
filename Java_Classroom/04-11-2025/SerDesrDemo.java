//04-11-2025
package com.codegnan.iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerDesrDemo {

	public static void main(String[] args) {
		Employee emp1=new Employee(111,"e1",60000,"hyd");
		System.out.println("Before seriaization employee details");
		emp1.displayEmployeeDetails();
		String filePath="emp.txt";
		try(FileOutputStream fos=new FileOutputStream(filePath);
				ObjectOutputStream oos=new ObjectOutputStream(fos)) {
					oos.writeObject(emp1);
					System.out.println("serialized object: "+emp1);
					System.out.println();
		} catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("De-serialization process");
		try(FileInputStream fis=new FileInputStream(filePath);
				ObjectInputStream ois=new ObjectInputStream(fis)) {
					Employee emp2=(Employee) ois.readObject();
					System.out.println("after de-serialization employee details: ");
					emp2.displayEmployeeDetails();
					System.out.println("de-serialized object: "+emp2);
		} catch(IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
