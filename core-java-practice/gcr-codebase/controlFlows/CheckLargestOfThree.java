package com.control.flow;

import java.util.Scanner;

//Write a program to check if the first, second, or third number is the largest of the three.
//I/P => number1, number2, number3
//O/P => 
//Is the first number the largest? ____
//Is the second number the largest? ___
//Is the third number the largest? ___

public class CheckLargestOfThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int number1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int number2 = sc.nextInt();
		System.out.println("Enter the third number: ");
		int number3 = sc.nextInt();
		
		System.out.print("Is the first number the largest? ");
		System.out.println(number1 > number2 && number1 > number3);
		
		System.out.print("Is the second number the largest? ");
		System.out.println(number2 > number1 && number2 > number3);
		
		System.out.print("Is the third number the largest? ");
		System.out.println(number3 > number2 && number3 > number1);
	}
}
