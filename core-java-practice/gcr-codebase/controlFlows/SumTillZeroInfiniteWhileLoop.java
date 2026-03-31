package com.control.flow;

import java.util.Scanner;

//Rewrite the program 10 to find the sum until the user enters 0 or a negative number using while loop and break statement
//Hint => 
//Use infinite while loop as in while (true)
//Take the user entry and check if the user entered 0 or a negative number to break the loop using break;

public class SumTillZeroInfiniteWhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double total = 0.0;
		double curr = 1;
		
		while(true) {
			System.out.println("Enter a number: ");
			double num = sc.nextDouble();
			
			if(num <= 0) break;
			total += num;
			curr = num;
		}
		
		System.out.println("Sum of all the numbers till now is: " + total);
	}
}
