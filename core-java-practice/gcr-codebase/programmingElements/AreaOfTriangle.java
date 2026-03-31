package programmingElements;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the base of the triangle: ");
		int base = sc.nextInt();
		System.out.println("Enter the height of the triangle: ");
		int height = sc.nextInt();
		
		double areaInSqInches = 0.5 * base * height;

        double areaInSqCm = areaInSqInches * 6.4516;

        System.out.println("Area of the triangle in cm is " + areaInSqCm + " while in inches is " + areaInSqInches);
	}
}
