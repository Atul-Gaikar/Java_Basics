package com.bridgrlabz.JavaBasics;

import java.util.Scanner;

public class TransposeMatrix {
	public static void main(String[] args) {
		int i, j;
		System.out.println("Enter The Rows & Column: ");
		Scanner sc = new Scanner(System.in);
		int Row = sc.nextInt();
		int Column = sc.nextInt();
		int arr[][] = new int[Row][Column];
		System.out.println("Enter Matrix");
		 for(i = 0; i < Row; i++)  
		    {  
		        for(j = 0; j < Column; j++)   
		            {  
		            arr[i][j] = sc.nextInt();  
		            System.out.print(" ");  
		            }  
		    } 

	}
}
