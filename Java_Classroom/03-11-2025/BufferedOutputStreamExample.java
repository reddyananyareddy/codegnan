//03-11-2025
package com.codegnan.iostreams;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {

	public static void main(String[] args) {
		
		String filePath="jfs41bos.txt";
		String content="Java programming was developed by James Ghosling in 1995.\n"
						+"It is most powerful programming language.\n"
						+"Write once run anywhere\n"
						+"Memory cleanup";
		try(BufferedOutputStream bos=
				new BufferedOutputStream(new FileOutputStream(filePath))) {
			byte[] data=content.getBytes();
			bos.write(data);
			System.out.println("Data written to a file successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		} 
		

	}

}
