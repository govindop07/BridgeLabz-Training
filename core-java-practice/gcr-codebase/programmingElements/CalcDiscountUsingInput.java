package programmingElements;

import java.util.Scanner;

public class CalcDiscountUsingInput {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the student fees: ");
		int fee = sc.nextInt();
		System.out.println("Enter the fees discount percentage: ");
		int discountPercentage = sc.nextInt();
		
		double discount = fee * discountPercentage / 100;
		double discountedFee = fee - discount;
		
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
	}
}
