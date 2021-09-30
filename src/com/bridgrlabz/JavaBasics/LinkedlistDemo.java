package com.bridgrlabz.JavaBasics;

import java.util.LinkedList;

public class LinkedlistDemo {
	public static void main(String[] args) {
		
		LinkedList l =new LinkedList();
		l.add("Atul");
		l.add("Ajay");
		l.add("Amit");
		l.remove("Ajinkya");
		l.set(0,"Vijay");
		l.add(0,"Viraj");
		l.addFirst("Vikas");
		l.addLast("Raje");
		System.out.println(l);//[Vikas, Viraj, Vijay, Ajay, Amit, Raje]
	}
}
