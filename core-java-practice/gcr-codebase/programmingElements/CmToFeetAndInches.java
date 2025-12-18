package programmingElements;

import java.util.Scanner;

public class CmToFeetAndInches {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the height in cm");
		int heightCm = sc.nextInt();
		
		double heightInches = heightCm / 2.54;
		double heightFeet = heightInches / 12;
		
		System.out.println("Your height in cm is " + heightCm + " while in feet is " + heightFeet + " and inches is " + heightInches);
	}
}
