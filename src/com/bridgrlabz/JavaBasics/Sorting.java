package com.bridgrlabz.JavaBasics;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {

		int[] arr = { 10, 5, 9, 6, 3 };
		Arrays.sort(arr);

		String str = "";
		for (int i = 0; i < 3; i++) {
			str = str + arr[i] + "_";
		}
		System.out.println(str.substring(0, arr.length));
	}

}
