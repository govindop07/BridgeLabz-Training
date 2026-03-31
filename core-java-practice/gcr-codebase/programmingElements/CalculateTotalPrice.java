package programmingElements;

import java.util.Scanner;

public class CalculateTotalPrice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the unit price: ");
		int unitPrice = sc.nextInt();
		System.out.println("Enter the quantity: ");
		int quantity = sc.nextInt();
		
		int totalPrice = unitPrice * quantity;
		System.out.println("The total purchase price is INR " + totalPrice + " is the quantity " + quantity + " and unit price is INR " + unitPrice);
	}
}
