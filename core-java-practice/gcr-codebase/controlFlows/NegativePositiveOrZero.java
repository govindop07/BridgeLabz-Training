package com.control.flow;

import java.util.Scanner;

//Write a program to check whether a number is positive, negative, or zero.
//Hint => 
//Get integer input from the user and store it in the number variable.
//If the number is positive, print positive.
//If the number is negative, print negative.
//If the number is zero, print zero.


public class NegativePositiveOrZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if(num < 0) System.out.println("Negative");
		else if(num == 0) System.out.println("Zero");
		else System.out.println("Positive");
	}
}
