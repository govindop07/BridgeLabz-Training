package com.control.flow;

import java.util.Scanner;

//Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per the following guidelines 
//
//Hint => 
//Ensure the Output clearly shows the Average Mark as well as the Grade and Remarks

public class CalculateGeadeAndMarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter physics marks: ");
		int physicsMarks = sc.nextInt();
		System.out.println("Enter chemistry marks: ");
		int chemistryMarks = sc.nextInt();
		System.out.println("Enter maths marks: ");
		int mathsMarks = sc.nextInt();
		
		float percentage = (physicsMarks + chemistryMarks + mathsMarks) / 3;
		
		if(percentage <= 39) print('R', "Remidial standards", percentage);
		else if(percentage >= 40 && percentage <= 49) print('E', "Level 1- too below agency-normalized standards", percentage);
		else if(percentage >= 50 && percentage <= 59) print('D', "Level 1- well below agency-normalized standards", percentage);
		else if(percentage >= 60 && percentage <= 69) print('C', "Level 2- below, but reaching agency-normalized standards", percentage);
		else if(percentage >= 70 && percentage <= 79) print('B', "Level 3- at agency-normalized standards", percentage);
		else if(percentage >= 80) print('A', "Level 4- above agency-normalized standards", percentage);
	}

	private static void print(char grade, String remarks, float percentage) {
		System.out.println("The average marks is: " + percentage);
		System.out.println("The grade is: " + grade);
		System.out.println("The remarks is: " + remarks);
	}
}
