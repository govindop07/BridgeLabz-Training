package com.control.flow;

import java.util.Scanner;

//Rewrite the above program 7 to find the factors of a number using the while loop
//Hint => 
//Get the input value for a variable named number and check if it is a positive integer.
//Create a counter variable and run the _**while**_ loop till the counter is less than the user input number. In each iteration of the loop, check if the number is perfectly divisible by the counter. If true, print the value of the counter.

public class FactorsOfANumberWhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("It is not a positive number.");
			return;
		}
		
		int i = 0;
		System.out.println("Factors of " + num + " are: ");
		while(i++ <= num) {
			if(num % i == 0) System.out.println(i);
		}
		
	}
}
