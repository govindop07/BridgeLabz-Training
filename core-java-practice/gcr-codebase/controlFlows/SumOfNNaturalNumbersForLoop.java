package com.control.flow;

import java.util.Scanner;

//Rewrite the program number 12 with the for loop instead of a while loop to find the sum of n Natural Numbers. 
//Hint => 
//Take the user input number and check whether it's a Natural number
//If it's a natural number Compute using formulae as well as compute using for loop
//Compare the two results and print the result

public class SumOfNNaturalNumbersForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a natural number: ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("It is not a natural number.");
			return;
		}
		
		int sum = 0;
		for(int i=0; i<=num; i++) sum += i;
		System.out.println("The sum of " + num + " natural numbers is: " + sum);
	}
}
