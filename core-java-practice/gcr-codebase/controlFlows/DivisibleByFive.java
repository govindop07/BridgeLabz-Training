package com.control.flow;

import java.util.Scanner;

//Write a program to check if a number is divisible by 5
//I/P => number
//O/P => Is the number ___ divisible by 5? ___
		
public class DivisibleByFive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		System.out.print("Is the number " + num + " divisible by 5? ");
		System.out.println(num % 5 == 0);
	}
}
