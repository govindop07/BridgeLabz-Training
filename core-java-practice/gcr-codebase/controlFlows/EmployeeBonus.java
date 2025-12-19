package com.control.flow;

import java.util.Scanner;

//Create a program to find the bonus of employees based on their years of service.
//Hint => 
//Zara decided to give a bonus of 5% to employees whose year of service is more than 5 years.
//Take salary and year of service in the year as input.
//Print the bonus amount.

public class EmployeeBonus {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the current salary of the employee: ");
		int currentSalary = sc.nextInt();
		System.out.println("Enter the total years of service of the employee: ");
		int yearsOfService = sc.nextInt();
		
		int bonus = 0;
		
		if(yearsOfService >= 5) {
			bonus = (currentSalary * 5) / 100;
		}
		
		System.out.println("The bonus os the employee with salary " + currentSalary + " is " + bonus);
		
	}
}
