//04-11-2025
package com.codegnan.iostreams;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CSVWriterExample {

	public static void main(String[] args) {
		List<Person>people=new ArrayList<>();
		people.add(new Person("p1",20,"hyd"));
		people.add(new Person("p2",20,"vjy"));
		people.add(new Person("p3",20,"bng"));
		
		try(PrintWriter out=new PrintWriter("people.csv")){ //people.txt
			out.print("name,age,city");
			out.println();
			for(Person person:people) {
				out.println(person.toCSV());
				out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
