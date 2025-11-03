//03-11-2025
package com.codegnan.iostreams;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {

	public static void main(String[] args) {
		try(PrintWriter out=new PrintWriter("output.txt")) {
			out.print("hello java ");
			out.println(10.5);
			out.print('a');
			out.print(' ');
			out.println(false);
			out.println(100);
			System.out.print("data written to a file successfully!");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
