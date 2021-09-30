package com.bridgrlabz.JavaBasics;

import java.util.Scanner;

//public class Atributes {
//	String firstname = "Atul";
//	String lastname = "Gaikar";
//	int age = 25;
//
//	public static void main(String[] args) {
//		Atributes obj = new Atributes();
//		System.out.println("Name: " + obj.firstname + " " + obj.lastname);
//		System.out.println("Age: " + obj.age);
//
//	}
//
//}
public class Atributes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Name: ");
		String st = sc.nextLine();
		System.out.println("Enter The Age:");
		int age = sc.nextInt();
		System.out.println("Name :" + st);
		System.out.println("Age :" + age);

	}
}