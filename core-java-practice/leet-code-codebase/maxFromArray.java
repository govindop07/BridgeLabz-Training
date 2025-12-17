package leetCode;

public class maxFromArray {
	public static void main(String[] args) {
		int[] nums = {2,5,2,5,3,2,2,9,8,10,11};
		
		int max = findMax(nums);
		System.out.println("Largest element in the array is: " + max);
	}

	private static int findMax(int[] nums) {
		int max = Integer.MIN_VALUE;
		for(int num: nums) max = Math.max(max, num);
		return max;
	}
}
