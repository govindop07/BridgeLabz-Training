package com.string;

//Write a program to split the text into words and return the words along with their lengths in a 2D array
//Hint => 
//Take user input using the Scanner nextLine() method 
//Create a Method to split the text into words using the charAt() method without using the String built-in split() method and return the words.
//Create a method to find and return a string's length without using the length() method. 
//Create a method to take the word array and return a 2D String array of the word and its corresponding length. Use String built-in function String.valueOf() to generate the String value for the number
//The main function calls the user-defined method and displays the result in a tabular format. During display make sure to convert the length value from String to Integer and then display

import java.util.Scanner;

class SplitArray2d {

    static int findLength(String text) {
        int count = 0;
        try {
            while (true) text.charAt(count++);
        } catch (Exception e) {}
        return count-1;
    }

    static String[][] wordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }
        return table;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();
        String[] words = text.split(" ");

        String[][] table = wordLengthTable(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }
    }
}

