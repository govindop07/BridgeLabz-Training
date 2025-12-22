package com.string;

import java.util.Scanner;

//Write a program to convert the complete text to lowercase and compare the results
//Hint => 
//Take user input using the  Scanner nextLine() method to take the complete text into a String variable
//Write a method using the String built-in charAt() method to convert each character if it is uppercase to the lowercase. Use the logic ASCII value of 'a' is 97 and 'A' is 65 so the difference is 32, similarly ASCII value of 'b' is 98 and 'B' is 66 so the difference is 32, and so on
//Write a method to compare two strings using the charAt() method and return a boolean result
//In the main() use the String built-in method toLowerCase() to get the lowercase text and compare the two strings using the user-defined method. And finally display the result

public class TextToLowercase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a text: ");
		String text = sc.nextLine();
		
		String lowerBuiltIn = text.toLowerCase();
		String lowerUserDefined = toLowerCase(text);
		
		System.out.println("Text's lowercase using built-In function: " + lowerBuiltIn);
		System.out.println("Text's lowercase using user-defined function: " + lowerUserDefined);
	}

	private static String toLowerCase(String text) {
		String str = "";
		for(int i=0; i<text.length(); i++) {
			char c = text.charAt(i);
			
			if(c >= 'A' && c <= 'Z') {
				c = (char) (c + 32);
			}
			str += c;
		}
		return str;
	}
}
