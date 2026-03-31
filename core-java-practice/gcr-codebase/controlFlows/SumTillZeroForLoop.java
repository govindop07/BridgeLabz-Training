package com.control.flow;

import java.util.Scanner;

public class SumTillZeroForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double total = 0.0;
		double curr = 1;
		
		for(int i=1; i>0; i++) {
			System.out.println("Enter a number: ");
			double num = sc.nextDouble();
			
			if(num <= 0) break;
			total += num;
			curr = num;
		}
		
		System.out.println("Sum of all the numbers till now is: " + total);
	}
}
