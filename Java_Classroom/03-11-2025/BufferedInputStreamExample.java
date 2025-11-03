//03-11-2025
package com.codegnan.iostreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {

	public static void main(String[] args) {
		String filePath="jfs41bos.txt";
		try(BufferedInputStream bis=
				new BufferedInputStream(new FileInputStream(filePath))) {
			int byteData;
			while((byteData=bis.read())!=-1) {
				System.out.print((char)(byteData));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
