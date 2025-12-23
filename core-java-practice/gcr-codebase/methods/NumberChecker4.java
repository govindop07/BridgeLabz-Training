package com.methods;

public class NumberChecker4 {

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int n) {
        long sq = (long) n * n;
        int sum = 0;
        while (sq > 0) {
            sum += sq % 10;
            sq /= 10;
        }
        return sum == n;
    }

    public static boolean isSpy(int n) {
        int[] d = NumberCheck.getDigits(n);
        int sum = 0, prod = 1;
        for (int digit : d) {
            sum += digit;
            prod *= digit;
        }
        return sum == prod;
    }

    public static boolean isAutomorphic(int n) {
        long sq = (long) n * n;
        return String.valueOf(sq).endsWith(String.valueOf(n));
    }

    public static boolean isBuzz(int n) {
        return n % 7 == 0 || n % 10 == 7;
    }

    public static void main(String[] args) {
        int[] tests = {7, 9, 112, 25, 77};
        for (int t : tests) {
            System.out.println(t + ":");
            System.out.println("  Prime?       " + isPrime(t));
            System.out.println("  Neon?        " + isNeon(t));
            System.out.println("  Spy?         " + isSpy(t));
            System.out.println("  Automorphic? " + isAutomorphic(t));
            System.out.println("  Buzz?        " + isBuzz(t));
            System.out.println();
        }
    }
}