package coreJava.flipKeyLogicalProblem;

import java.util.Scanner;

public class Program {

	public String CleanseAndInvert(String input) {

		// null or length less than 6
		if (input == null || input.length() < 6) {
			return "";
		}

		// no space, digit or special character
		for (char ch : input.toCharArray()) {
			if (!Character.isLetter(ch)) {
				return "";
			}
		}

		// Convert to lowercase
		input = input.toLowerCase();

		// Remove characters with even ASCII values
		StringBuilder filtered = new StringBuilder();
		for (char ch : input.toCharArray()) {
			if ((int) ch % 2 != 0) { // keep only odd ASCII
				filtered.append(ch);
			}
		}

		// If nothing remains after filtering
		if (filtered.length() == 0) {
			return "";
		}

		// Reverse the string
		filtered.reverse();

		// Convert even index characters to uppercase
		for (int i = 0; i < filtered.length(); i++) {
			if (i % 2 == 0) {
				filtered.setCharAt(i, Character.toUpperCase(filtered.charAt(i)));
			}
		}

		return filtered.toString();
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Program obj = new Program();

		System.out.println("Enter the word");
		String input = sc.nextLine();

		String result = obj.CleanseAndInvert(input);

		if (result.isEmpty()) {
			System.out.println("Invalid Input");
		} else {
			System.out.println("The generated key is - " + result);
		}

		sc.close();
	}
}
