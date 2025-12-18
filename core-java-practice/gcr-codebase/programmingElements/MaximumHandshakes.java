package programmingElements;

import java.util.Scanner;

public class MaximumHandshakes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int noOfStudents = sc.nextInt();
		
		int totalHandshakes = (noOfStudents * (noOfStudents - 1)) / 2;
		
		System.out.println("The maximum no. of handshakes in " + noOfStudents + " students is " + totalHandshakes);
	}
}
