package com.string;

import java.util.Scanner;

//Write a program to demonstrate IllegalArgumentException
//Hint => 
//Define a variable of type String and take user input to assign a value
//Write a Method to generate the Exception. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception and abruptly stop the program. 
//Write the Method to demonstrate IllegalArgumentException. Here use the subString() and set the start index to be greater than the end index. This will generate a runtime exception. Use the try-catch block to handle the IllegalArgumentException and the generic runtime exception
//From the main Firstly call the method to generate the Exception then call the method to handle the RuntimeException

class IllegalAurgumentExceptionInStrings {

    static void generateException(String text) {
        // start index is greater than end index
        String result = text.substring(5, 2);
        System.out.println(result);
    }

    static void handleException(String text) {
        try {
            String result = text.substring(5, 2);
            System.out.println(result);
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught.");
            System.out.println("Start index cannot be greater than end index.");
        }
        catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        try {
            generateException(input);
        }
        catch (Exception e) {
            System.out.println("Exception occurred while generating exception.");
        }

        handleException(input);
    }
}
