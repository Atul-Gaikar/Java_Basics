package com.bridgrlabz.JavaBasics;

public class ArrayEquality {
	public static void main(String[] args) {
		int[] arrayFirst = { 2, 5, 1, 7, 4 };

		int[] arraySecond = { 2, 1, 5, 7, 4 };

		boolean equalOrNot = true;

		if (arrayFirst.length == arraySecond.length) {
			for (int i = 0; i < arrayFirst.length; i++) {
				if (arrayFirst[i] != arraySecond[i]) {
					equalOrNot = false;
				}
			}
		} else {
			equalOrNot = false;
		}

		if (equalOrNot) {
			System.out.println(" Arrays Are Equal");
		} else {
			System.out.println("Arrays Are Not equal");
		}
	}
}