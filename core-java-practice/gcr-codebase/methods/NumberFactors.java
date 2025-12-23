package com.methods;

import java.util.Scanner;

public class NumberFactors {

    public static int[] getFactors(int num) {
        if (num <= 0) return new int[0];

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    public static long sumOfFactors(int[] factors) {
        long sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    public static long sumOfSquares(int[] factors) {
        long sumSq = 0;
        for (int f : factors) {
            sumSq += (long) Math.pow(f, 2);
        }
        return sumSq;
    }

    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        int[] factors = getFactors(number);

        System.out.print("Factors of " + number + " → ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Sum of squares: " + sumOfSquares(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));

        sc.close();
    }
}