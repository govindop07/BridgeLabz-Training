package programmingElements;
import java.util.Scanner;

public class InputKMToMiles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of kilometers");
		int km = sc.nextInt();
		
		double miles = km * 1.6;
		System.out.println("The total miles is " + miles + " for the given " + km + " km");
	}
}
