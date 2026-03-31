package com.control.flow;

import java.util.Scanner;

//Create a program to find the multiplication table of a number entered by the user from 6 to 9.
//Hint => 
//Take integer input and store it in the variable number
//Using a for loop, find the multiplication table of number from 6 to 9 and print it in the format number * i = ___ 

public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 6 and 9: ");
		int num = sc.nextInt();
		
		if(num < 6 || num > 9) {
			System.out.println("The number is not between 6 and 9.");
			return;
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
	}
}
