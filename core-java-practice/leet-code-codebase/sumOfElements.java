package leetCode;

public class sumOfElements {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		int sum = findSum(arr);
		System.out.println("Sum of all the numbers in the array is: " + sum);
	}

	private static int findSum(int[] arr) {
		int sum = 0;
		for(int num: arr) sum += num;
		return sum;
	}

}
