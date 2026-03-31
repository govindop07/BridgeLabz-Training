package com.control.flow;

import java.util.Scanner;

//Write a program to find the sum of n natural numbers using while loop compare the result with the formulae n*(n+1)/2 and show the result from both computations was correct. 
//Hint => 
//Take the user input number and check whether it's a Natural number
//If it's a natural number Compute using formulae as well as compute using while loop
//Compare the two results and print the result


public class SumOfNNaturalNumbersWhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a natural number: ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("It is not a natural number.");
			return;
		}
		
		int sum = 0, i = 0;
		while(i <= num) sum += i++;
		
		System.out.println("The sum of the " + num + " natural numbers is " + sum);
	}
}
