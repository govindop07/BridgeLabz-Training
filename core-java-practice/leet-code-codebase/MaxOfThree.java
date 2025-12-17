package leetCode;

public class MaxOfThree {
	
	private static int findMax(int a, int b, int c) {
		if(a > b && a > c) return a;
		else if(b > a && b > c) return b;
		return c;
	}
	
	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 8;
		
		int maxi = findMax(a, b, c);
		System.out.println("Maximum number is: " + maxi);
	}

}
