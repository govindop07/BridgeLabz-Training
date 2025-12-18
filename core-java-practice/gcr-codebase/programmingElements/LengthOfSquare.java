package programmingElements;

import java.util.Scanner;

public class LengthOfSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the perimeter of the square: ");
		int perimeter = sc.nextInt();
		
		float side = (float)perimeter / 4;
		System.out.println("The length of the side is " + side + " whose parameter is " + perimeter);
	}
}
