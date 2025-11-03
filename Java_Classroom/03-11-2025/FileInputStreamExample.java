//03-11-2025
package com.codegnan.iostreams;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {

	public static void main(String[] args) {
		String filePath="jfs41fos.txt";
		try(FileInputStream fis=new FileInputStream(filePath)) {
			int byteData;
			while((byteData=fis.read())!=-1) {
				System.out.print((char)(byteData));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
