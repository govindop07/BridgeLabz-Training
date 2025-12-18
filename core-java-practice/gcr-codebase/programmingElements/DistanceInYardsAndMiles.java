package programmingElements;

import java.util.Scanner;

public class DistanceInYardsAndMiles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the distance in feet: ");
		double distanceFeet = sc.nextInt();
		
		double distanceYards = distanceFeet / 3;
		double distanceMile = distanceYards / 1760;
		System.out.println("The distance in feet is " + distanceFeet + " while in yards is " + distanceYards + " and in miles is " + distanceMile);
	}
}
