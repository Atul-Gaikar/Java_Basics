package com.bridgrlabz.JavaBasics;

import java.util.Scanner;

import java.util.GregorianCalendar;
import java.util.Random;

public class Birthdate {

	public static void main(String[] args) {
		int[] dateArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25,
				26, 27, 28, 29, 30, 31 };
		String[] monthArray = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
		int[] yearArray = { 1992, 1993 };
		for (int i = 0; i < 50; i++) {
			Random num = new Random();
			int dateIndex = num.nextInt(dateArray.length);
			int monthIndex = num.nextInt(monthArray.length);
			int yearIndex = num.nextInt(yearArray.length);
			int date = dateArray[dateIndex];
			String month = monthArray[monthIndex];
			int year = yearArray[yearIndex];
			System.out.println("Random Birthdate : " + date + " " + month + " " + year);
		}

	}
}