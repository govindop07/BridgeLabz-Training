package com.control.flow;

import java.util.Scanner;

//Create a program to count the number of digits in an integer.
//Hint => 
//Get an integer input for the number variable.
//Create an integer variable count with value 0.
//Use a loop to iterate until number is not equal to 0.
//Remove the last digit from number in each iteration
//Increase count by 1 in each iteration.
//Finally display the count to show the number of digits

public class NumberOfDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("It is not a positive number.");
			return;
		}
		
		int totalDigits = 0;
		while(num > 1) {
			num /= 10;
			totalDigits++;
		}
		System.out.println("Total number of digits is: " + totalDigits);
	}
}
