package com.control.flow;

import java.util.Scanner;

//Create a program to find the power of a number.
//Hint => 
//Get integer input for two variables - number and power and check for positive integer
//Create a result variable with an initial value of 1.
//Run a for loop from i = 1 to i <= power. In each iteration of the loop, multiply the result by the number and assign the value to the result. Finally, print the result

public class PowerOfANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int num = sc.nextInt();
		System.out.println("Enter a positive power: ");
		int power = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("It is not a positive number.");
			return;
		}
		
		long ans = 1;
		for(int i=1; i<=power; i++) {
			ans = ans * num;
		}
		
		System.out.println("Result: " + ans);
	}
}
