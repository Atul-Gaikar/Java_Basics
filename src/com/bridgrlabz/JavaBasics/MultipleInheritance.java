package com.bridgrlabz.JavaBasics;

public class MultipleInheritance implements Ajay, Atul {

	public static void main(String args[]) {

		MultipleInheritance d = new MultipleInheritance();
		d.show();
	}

	public void show() {

		Ajay.super.show();

		Atul.super.show();
	}
}

interface Ajay {
	default void show() {
		System.out.println("Ajay");
	}
}

interface Atul {
	default void show() {
		System.out.println("Atul");
	}
}
