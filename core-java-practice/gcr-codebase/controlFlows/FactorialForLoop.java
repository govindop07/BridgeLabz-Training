package com.control.flow;

import java.util.Scanner;

//Write a Program to find the factorial of an integer entered by the user.
//Hint => 
//For example, the factorial of 4 is 1 * 2 * 3 * 4 which is 24.
//Take an integer input from the user and assign it to the variable. Check the user has entered a positive integer.
//Using a while loop, compute the factorial.
//Print the factorial at the end.

public class FactorialForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("It is not a positive number.");
			return;
		}
		
		int factorial = 1;
		for(int i=1; i<=num; i++) factorial *= i;
		System.out.println("Factorial: " + factorial);
	}
}
