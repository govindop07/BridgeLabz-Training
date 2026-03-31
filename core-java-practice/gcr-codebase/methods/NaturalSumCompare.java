package com.methods;

import java.util.Scanner;

public class NaturalSumCompare {

    public static long sumRecursive(int n) {
        if (n <= 1) return n;
        return n + sumRecursive(n - 1);
    }

    public static long sumFormula(int n) {
        return (long) n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number (n ≥ 1): ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive number");
            return;
        }

        long recursiveResult = sumRecursive(n);
        long formulaResult = sumFormula(n);

        System.out.println("Sum using recursion: " + recursiveResult);
        System.out.println("Sum using formula: " + formulaResult);

        if (recursiveResult == formulaResult) {
            System.out.println("Both results are same? " + true);
        } else {
            System.out.println("Both results are same? " + false);
        }

        sc.close();
    }
}