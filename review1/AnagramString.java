import java.util.Arrays;

public class AnagramString {
	
	public static boolean checkAnagram(String str1, String str2) {
		if(str1.length() != str2.length()) return false;
		
		String string1 = str1.toLowerCase();
		String string2 = str2.toLowerCase();
		char[] str1Array = string1.toCharArray();
		char[] str2Array = string2.toCharArray();
		
		Arrays.sort(str1Array);
		Arrays.sort(str2Array);
		return Arrays.equals(str1Array, str2Array);
	}
	
	public static void main(String[] args) {
		String str1 = "Govind";
		String str2 = "dnivog";
		
		System.out.println(str1 + " and " + str2 + " are anagrams: " + checkAnagram(str1, str2));
	}
}
