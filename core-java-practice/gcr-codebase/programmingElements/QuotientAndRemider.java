package programmingElements;

import java.util.Scanner;

public class QuotientAndRemider {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		
		int quotient = num1 / num2;
		int reminder = num1 % num2;
		System.out.println("The quotient is " + quotient + " and reminder is " + reminder + " of two numder " + num1 + " and " + num2);
	}
}
