package com.bridgrlabz.JavaBasics;

import java.util.stream.IntStream;

public class Sum {
	public static void main(String[] args) {
		IntStream stream = IntStream.of(1,100);
		int sumOfElements = stream.sum();
		System.out.println(sumOfElements);
	}
}