package com.bridgrlabz.JavaBasics;

//interface printable {
//	void print();
//}
//
//public class Demo1 implements printable {
//	public void print() {
//		System.out.println("Goog Morning Everyone");
//	}
//
//	public static void main(String args[]) {
//		Demo1 obj = new Demo1();
//		obj.print();
//	}
//}
public class Demo1 {
	public static void main(String[] args) {
		int n1 = 0, n2 = 1, n3, i, count = 5;
		System.out.println(n1 + " " + n2);
		for (i = 2; i < 5; i++) {
			n3 = n1 + n2;
			System.out.println(" " + n3);
			n1 = n2;
			n2 = n3;

		}

	}
}