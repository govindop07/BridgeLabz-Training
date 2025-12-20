package com.control.flow;

import java.util.Scanner;

//Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators

public class LeapYearWithSingleIfCondition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an year greater than 1582: ");
		int year = sc.nextInt();
		
		if(year < 1582) {
			System.out.println("Please enter an year greater than 1582.");
			return;
		}
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}
	}
}
