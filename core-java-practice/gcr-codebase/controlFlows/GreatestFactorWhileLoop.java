package com.control.flow;

import java.util.Scanner;

//Rewrite the above program to print the greatest factor of a number beside itself using a while loop.
//Hint => 
//Get an integer input and assign it to the number variable. As well as define a greatestFactor variable and assign it to 1
//Create a variable counter and assign counter = number - 1; Use the while loop till the counter is equal to 1.
//Inside the loop, check if the number is perfectly divisible by the counter then assign the counter to greatestFactor variable and break the loop.
//Display the greatestFactor variable outside the loop

public class GreatestFactorWhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("It is not a positive number.");
			return;
		}
		
		int greatestFactor = 1, i = num;
		while(i-- > 1) {
			if(num % i == 0) {
				greatestFactor = i;
				break;
			}
		}
		System.out.println("Greatest factor of " + num + " is " + greatestFactor);
	}
}
