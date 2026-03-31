package com.control.flow;

import java.util.Scanner;

//Write a program SpringSeason that takes two int values month and day from the command line and prints “Its a Spring Season” otherwise prints “Not a Spring Season”. 
//Hint => 
//Spring Season is from March 20 to June 20

public class SpringSeason {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the month number: ");
		int month = sc.nextInt();
		System.out.println("Enter the day number: ");
		int day = sc.nextInt();
		
		if(month >= 3 && month <= 6) {
			if(month == 3 && day < 20  ||  month == 6 && day > 20) {
				System.out.println("Not a spring season");
			} else {
				System.out.println("Its a spring season");
			}
		} else {
			System.out.println("Not a spring season");
		}
	}
}
