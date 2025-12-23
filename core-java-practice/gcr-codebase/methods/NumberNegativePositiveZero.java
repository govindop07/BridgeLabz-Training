package com.methods;

import java.util.Scanner;

public class NumberNegativePositiveZero {

    static boolean isPositive(int num) {
        return num > 0;
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    static int compare(int a, int b) {
        if (a > b) return 1;
        if (a < b) return -1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.print(num + " is Positive and ");
                System.out.println(isEven(num) ? "Even" : "Odd");
            } else {
                System.out.println(num + " is Negative");
            }
        }

        int result = compare(numbers[0], numbers[4]);
        if (result == 1) System.out.println("First is greater than last");
        else if (result == -1) System.out.println("Last is greater than first");
        else System.out.println("Both are equal");

        sc.close();
    }
}