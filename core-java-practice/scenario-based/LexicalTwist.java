//Lexical Twist
//Leo loves puzzles and he enjoys creating challenges for his friends. Today, Leo has
//a new puzzle for his friend, involving two words. The task is to process the words
//and perform various transformations and analyses based on specific conditions.
//Requirements:
//1. Check if the second word is a reversed version of the first word:
//- The second word is considered the "reversed version" of the first word if the second
//word is the first word in reverse order (case insensitive).
//2. If the second word is the reversed version of the first word:
//- Step 1: Reverse the first word.
//- Step 2: Convert the reversed word to lowercase.
//- Step 3: Replace all vowels (a, e, i, o, u) in the reversed word with the character
//'@'.
//- Step 4: Then, print the transformed word.
//3. If the second word is not the reversed version of the first word:
//- Step 1: Combine the first and second words into a single word (first word + second
//word).
//- Step 2: Convert the combined word to uppercase.
//- Step 3: Count the number of vowels and consonants separately in the
//uppercase word.
//- Step 4: Based on the counts:
//● If there are more vowels than consonants, print the first 2 vowels in the
//uppercase word, removing any duplicates.
//● If there are more consonants than vowels, print the first 2 consonants in
//the uppercase word, removing any duplicates.
//● If the vowel count equals consonant count, print "Vowels and consonants
//are equal".
//Validations:
//- If the input words contain more than one word, print "<string> is an invalid word"
//and terminate the program (Do not use System.exit(0)).
//Note:
//
//● In the Sample Input / Output provided, the highlighted text in bold corresponds
//to the input given by the user and the rest of the text represents the output.
//● Adhere to the code template, if provided.
//● Please do not use System.exit(0) to terminate the program.

package coreJava.lexicalTwist;

import java.util.Scanner;

public class LexicalTwist {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first word: ");
		String firstWord = sc.nextLine();
		System.out.println("Enter the second word: ");
		String secondWord = sc.nextLine();
		
		
		if(firstWord.split(" ").length > 1) {
			System.out.println(firstWord + " is an invalid word");
		} else if(secondWord.split(" ").length > 1) {
			System.out.println(secondWord + " is an invalid word");
		}
		
		StringBuilder sbFirst = new StringBuilder(firstWord);
		if(sbFirst.reverse().toString().equals(secondWord)) {
			System.out.println("yes");
//			String rev = sbFirst.reverse().toString();
//			System.out.println(rev);
		}
		System.out.println(sbFirst);
		
		sc.close();
	}
}







