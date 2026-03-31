package com.control.flow;

import java.util.Scanner;

//Create a program to find the factors of a number taken as user input.
//Hint => 
//Get the input value for a variable named number and check if it is a positive integer.
//Run a for loop from i = 1 to i < number. In each iteration of the loop, check if the number is perfectly divisible by i. If true, print the value of i.

public class FactorsOfANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("It is not a positive number.");
			return;
		}
		
		System.out.println("Factors of " + num + " are: ");
		for(int i=1; i<=num; i++) {
			if(num % i == 0) System.out.println(i);
		}
		
	}
}
