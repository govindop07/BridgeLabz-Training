package com.control.flow;

import java.util.Scanner;

//Rewrite program 14 using for loop
//Hint => 
//Take the integer input, check for natural number and determine the factorial using for loop and finally print the result. 


public class FactorialWhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("It is not a positive number.");
			return;
		}
		
		int factorial = 1;
		while(num >= 1) factorial *= num--;
		System.out.println("Factorial: " + factorial);
	}
}
