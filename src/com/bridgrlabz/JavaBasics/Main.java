package com.bridgrlabz.JavaBasics;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
	public static void main(String args[]) throws IOException {
		FileInputStream inputFileReader = new FileInputStream("C:\\Users\\Atul Gaikar\\OneDrive\\Desktop\\Atul.txt");
		FileOutputStream outputFileWriter = new FileOutputStream("C:\\Users\\Atul Gaikar\\OneDrive\\Desktop\\Atul1.txt");
		int data;
		while ((data = inputFileReader.read()) != -1) {

			System.out.print((char) data);
			outputFileWriter.write(data);
			outputFileWriter.flush();
		}
	}
}