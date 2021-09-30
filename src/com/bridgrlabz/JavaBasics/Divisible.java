package com.bridgrlabz.JavaBasics;

import java.util.Scanner;

public class Divisible {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size =");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the element =");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();

		}
		System.out.println("Enter the target value =");
		int targetValue = sc.nextInt();
		checkDivisible(arr, targetValue);

	}

	private static void checkDivisible(int[] arr, int targetValue) {
		System.out.println("Output Elements =");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % targetValue == 0) {
				System.out.println(arr[i]);
			}
		}

	}
}
