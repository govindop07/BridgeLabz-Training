package com.control.flow;

import java.util.Scanner;

//Rewrite the above program to find the power of a number using a while loop.
//Hint => 
//Get integer input for two variables named number and power.
//Create a result variable with an initial value of 1.
//Create a temp variable counter and initialize to zero. Use the while loop till _**counter == power**_.
//In each iteration of the loop, multiply the result by the number and assign the value to the result. Also, increment the counter.
//Finally, print the result

public class PowerOfANumberWhileLoop {
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
		
		long ans = 1, i = 0;
		while(i++ < power) {
			ans = ans * num;
		}
		
		System.out.println("Result: " + ans);
	}
}