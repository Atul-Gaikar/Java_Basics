package com.bridgrlabz.JavaBasics;

import java.util.Scanner;

public class JavaString {
	public static void main(String args[]) {

		String s = "abcteababct";
		char ch[] = s.toCharArray();
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the common charaters:");
		String userInput = sc.next();
		char ch1[] = userInput.toCharArray();

		int count = 0;
		for (int i = 1; i < ch.length; i++) {
			for (int j = 1; j < ch1.length; j++) {
				if (ch[i] == ch1[j] && ch[i - 1] == ch1[j - 1]) {
					count++;
				}
			}
		}

		System.out.println(userInput + ":" + count);

	}
}
