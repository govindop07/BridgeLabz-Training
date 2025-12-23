package com.methods;

import java.util.*;

public class SimpleInterest {
	
	public static double simpleInterest(double principle, float rate, float time) {
		double interest = (principle * rate * time)/100;
		return interest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principal amount: ");
		double principal = sc.nextDouble();
		System.out.println("Enter the rate of interest: ");
		float rate = sc.nextFloat();
		System.out.println("Enter the time taken(in years): ");
		float time = sc.nextFloat();
		
		double interest = simpleInterest(principal, rate, time);
		System.out.println("The Simple Interest is " + interest + " rupees for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time + " years.");
	}

}
