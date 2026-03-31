package com.control.flow;

import java.util.Scanner;

//Write a program to check if the first is the smallest of the 3 numbers.
//I/P => number1, number2, number3
//O/P => Is the first number the smallest? ____

public class IsFirstTheSmallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int number1 = sc.nextInt();
		System.out.println("Enter the first number: ");
		int number2 = sc.nextInt();
		System.out.println("Enter the first number: ");
		int number3 = sc.nextInt();
		
		boolean isFirstSmallest = false;
		if(number1 < number2 && number1 < number3) isFirstSmallest = true;
		
		System.out.print("Is the first number the smallest? " + isFirstSmallest);
	}
}
