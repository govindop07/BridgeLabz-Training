package com.control.flow;

import java.util.Scanner;

//Write a program to create a calculator using switch...case.
//Hint => 
//Create two double variables named first and second and a String variable named op.
//Get input values for all variables.
//The input for the operator can only be one of the four values: "+", "-", "*" or "/".
//Run a for loop from i = 1 to i < number.
//Based on the input value of the op, perform specific operations using the switch...case statement and print the result.
//If op is +, perform addition between first and second; if it is -, perform subtraction and so on.
//If op is neither of those 4 values, print Invalid Operator.

public class CalculatorUsingSwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = sc.nextInt();
		System.out.print("Enter operation i.e., +, -, * and / ");
		String op = sc.next();

        switch (op) {
            case "+":
                System.out.println("Ans: " + (num1 + num2));
                break;

            case "-":
                System.out.println("Ans: " + (num1 - num2));
                break;

            case "*":
                System.out.println("Ans: " + (num1 * num2));
                break;

            case "/":
                if (num2 != 0) {
                    System.out.println("Ans: " + (num1 / num2));
                } else {
                    System.out.println("Division by zero is not allowed");
                }
                break;

            default:
                System.out.println("Invalid Operator");
        }
	}
}
