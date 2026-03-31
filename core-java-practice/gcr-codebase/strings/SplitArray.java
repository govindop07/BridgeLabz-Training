package com.string;

import java.util.*;

//Write a program to split the text into words, compare the result with the split() method and display the result 
//Hint => 
//Take user input using the Scanner nextLine() method 
//Create a Method to find the length of the String without using the built-in length() method. 
//Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words. Use the following logic
//Firstly Count the number of words in the text and create an array to store the indexes of the spaces for each word in a 1D array
//Then Create an array to store the words and use the indexes to extract the words
//Create a method to compare the two String arrays and return a boolean
//The main function calls the user-defined method and the built-in split() method. Call the user defined method to compare the two string arrays and display the result

public class SplitArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = sc.nextLine();

        int len = getManualLength(input);
        
        String[] manualWords = getManualSplit(input, len);

        String[] builtInWords = input.trim().split(" ");

        boolean areEqual = compareArrays(manualWords, builtInWords);

        System.out.println("Manual Split: " + Arrays.toString(manualWords));
        System.out.println("Built-in Split: " + Arrays.toString(builtInWords));
        System.out.println("Are they equal? " + areEqual);
    }

    public static int getManualLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] getManualSplit(String str, int len) {
        if (len == 0) return new String[0];

        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') wordCount++;
        }

        // Array to store indices of spaces
        int[] spaceIndices = new int[wordCount - 1];
        int indexRef = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                spaceIndices[indexRef++] = i;
            }
        }

        // Extract words using indices
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < spaceIndices.length; i++) {
            words[i] = extractSubstring(str, start, spaceIndices[i]);
            start = spaceIndices[i] + 1;
        }
        words[wordCount - 1] = extractSubstring(str, start, len); // Last word

        return words;
    }

    private static String extractSubstring(String str, int start, int end) {
        String res = "";
        for (int i = start; i < end; i++) {
            res += str.charAt(i);
        }
        return res;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }
}