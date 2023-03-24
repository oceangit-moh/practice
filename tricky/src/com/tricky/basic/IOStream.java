package com.tricky.basic;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class IOStream {
	public static void main(String[] args) throws IOException {
		FileOutputStream out = new FileOutputStream("C:\\Users\\sagar\\OneDrive\\Desktop\\out.txt");
		out.write(65);
		out.close();
		System.out.println("Write Success..");
		FileInputStream in = new FileInputStream("C:\\Users\\sagar\\OneDrive\\Desktop\\in.txt");
		int i = in.read();
		in.close();
		System.out.println("Read Success.." + (char)i);
		
		try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\sagar\\OneDrive\\Desktop\\in.txt") )) {
			String read = reader.readLine();
			System.out.println(read);
		}
		
	}
	
}
