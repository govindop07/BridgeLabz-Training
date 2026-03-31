package com.string;

import java.util.Scanner;

//Write a program to find and return the length of a string without using the length() method 
//Hint => 
//Take user input using the Scanner next() method 
//Create a method to find and return a string's length without using the built-in length() method. The logic for this is to use the infinite loop to count each character till the charAt() method throws a runtime exception, handles the exception, and then return the count
//The main function calls the user-defined method as well as the built-in length() method and displays the result

public class LengthOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		
		int lengthBuiltIn = str.length();
		int lengthUserDefined = checkLength(str);
		
		System.out.println("Length using built-in function: " + lengthBuiltIn);
		System.out.println("Length using user-defined function: " + lengthUserDefined);
	}

	private static int checkLength(String str) {
		int i = 0;
		
		while(true) {
			try {
				char c = str.charAt(i++);
			} catch (Exception e) {
				break;
			}
		}
		
		return i-1;
	}
}
