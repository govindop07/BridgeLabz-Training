package com.control.flow;

import java.util.Scanner;

//Create a program to print the greatest factor of a number beside itself using a loop.
//Hint => 
//Get an integer input and assign it to the number variable. As well as define a greatestFactor variable and assign it to 1
//Create a for loop that runs from last but one till 1 as in i = number - 1 to i = 1.
//Inside the loop, check if the number is perfectly divisible by i then assign i to greatestFactor variable and break the loop.
//Display the greatestFactor variable outside the loop

public class GreatestFactor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a positive number: ");
		int num = sc.nextInt();
		
		if(num <= 0) {
			System.out.println("It is not a positive number.");
			return;
		}
		
		int greatestFactor = 1;
		for(int i=num-1; i>1; i--) {
			if(num % i == 0) {
				greatestFactor = i;
				break;
			}
		}
		System.out.println("Greatest factor of " + num + " is " + greatestFactor);
		
	}
}
