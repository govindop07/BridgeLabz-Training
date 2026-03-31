package com.string;

import java.util.Scanner;

//Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results
//Hint => 
//Take user input using the  Scanner next() method to take the String variable and also the start and the end index to get the substring from the given text
//Write a method to create a substring from a string using the charAt() method with the string, start, and end index as the parameters
//Write a method to compare two strings using the charAt() method and return a boolean result
//Use the String built-in method substring() to get the substring and compare the two strings. And finally display the result

public class SubString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.next();
		System.out.println("Enter the starting index of the substring: ");
		int start = sc.nextInt();
		System.out.println("Enter the ending index of the substring: ");
		int end = sc.nextInt();
		
		String substringBuiltIn = str.substring(start, end);
		System.out.println("Substring using built in function: " + substringBuiltIn);
		String substringUserDefined = substring(str, start, end);
		System.out.println("Substring using user defined function: " + substringUserDefined);
	}

	private static String substring(String str, int start, int end) {
		String result = "";
		for(int i=start; i<end; i++) {
			result += str.charAt(i);
		}
		return result;
	}
}
