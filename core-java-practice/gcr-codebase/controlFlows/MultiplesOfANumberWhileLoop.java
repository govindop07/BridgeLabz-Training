package com.control.flow;

import java.util.Scanner;

//Rewrite the program to find all the multiples of a number below 100 using while loop.
//Hint => 
//Get the input value for a variable named number. Check the number is a positive integer and less than 100.
//Create a counter variable and assign counter = number - 1; Use a while till the counter is > 1
//Inside the loop, check if the counter perfectly divides the number. If true, print the number and continue the loop.

public class MultiplesOfANumberWhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("It is not a positive number.");
			return;
		}
		
		System.out.println("Multiples of " + num + " below 100 are: ");
		int i = 100;
		while(i-- > 1) {
			if(num % i == 0) System.out.println(i);
		}
		
	}
}
