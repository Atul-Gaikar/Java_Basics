package com.bridgrlabz.JavaBasics;

public class FibonacciSeriesWithoutRecursion {
	public static void main(String args[]) {
		int n1 = 2, n2 = 4, n3, i, count = 8;
		System.out.print(n1 + " " + n2);

		for (i = 2; i < count; ++i) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}

	}
}