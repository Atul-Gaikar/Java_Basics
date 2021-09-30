package com.bridgrlabz.JavaBasics;

public class MultilevelInheritance {
	public static void main(String[] arguments) {
		Cube cube = new Cube();
		cube.display();
		cube.area();
		cube.volume();
	}
}

class Shape {
	public void display() {
		System.out.println("Inside display");
	}
}

class Rectangle extends Shape {
	public void area() {
		System.out.println("Inside area");
	}
}

class Cube extends Rectangle {
	public void volume() {
		System.out.println("Inside volume");
	}
}

//class A
// 
//{
// 
//}
// 
//class B extends A
// 
//{
// 
//}
// 
//class C extends B
// 
//{
// 
//}
