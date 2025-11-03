//03-11-2025
package com.codegnan.iostreams;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) {
		String filePath="jfs41fos.txt";
		String content="Hello JFS42 batch.\n"+"Java programming is very easy.\n"+"When you practice!";
		try(FileOutputStream fos=new FileOutputStream(filePath)) {
			byte[] data=content.getBytes();
			fos.write(data);
			System.out.println("File created successfully and data written to file.");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
