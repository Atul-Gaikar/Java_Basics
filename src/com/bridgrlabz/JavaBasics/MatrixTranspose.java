package com.bridgrlabz.JavaBasics;

public class MatrixTranspose {
	public static void main(String args[]) {
		int original[][] = { { 1, 3 }, { 2, 4 } };
		int transpose[][] = new int[2][2];
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				transpose[i][j] = original[j][i];
			}
		}

		System.out.println("Printing Matrix Without Transpose:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(original[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Printing Matrix After Transpose:");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(transpose[i][j] + " ");
			}
			System.out.println();
		}
	}
}