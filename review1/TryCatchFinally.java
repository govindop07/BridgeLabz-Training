import java.util.Scanner;

public class TryCatchFinally {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		System.out.println("Enter a number from which you want to divide the previous number: ");
		int divisor = sc.nextInt();
		
		try {
			System.out.println("Starting division");
			int ans = num / divisor;
			System.out.println("The answer is: " + ans);
			
		} catch (ArithmeticException e) {
			System.out.println(e);
			
		} finally {
			System.out.println("Division happened");
		}
	}
}
