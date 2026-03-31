package leetCode;

public class PalindromeString {
	public static void main(String[] args) {
		String str = "racecar";
		boolean isPallindrome = checkPallindrome(str);
		
		if(isPallindrome) System.out.println(str + " is a pallinfrome");
		else System.out.println(str + " is not a pallinfrome");
	}

	private static boolean checkPallindrome(String str) {
		StringBuilder sb = new StringBuilder(str);
		
		String string = sb.toString();
		String reverse = sb.reverse().toString();
		
		return string.equals(reverse);
	}
}
