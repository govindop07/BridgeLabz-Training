package com.control.flow;

import java.util.Scanner;

//Write a Program to check if the given number is a prime number or not
//Hint => 
//A number that can be divided exactly only by itself and 1 are Prime Numbers,
//Prime Numbers checks are done for numbers greater than 1
//Loop through all the numbers from 2 to the user input number and check if the reminder is zero. If the reminder is zero break out from the loop as the number is divisible by some other number and is not a prime number. 
//Use the isPrime boolean variable to store the result

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("It is not a positive number.");
			return;
		}
		
		boolean isPrime = true;
		for(int i=2; i<num; i++) {
			if(num % i == 0) isPrime = false;
		}
		
		System.out.println("Is " + num + " a prime number? " + isPrime);
	}
}
