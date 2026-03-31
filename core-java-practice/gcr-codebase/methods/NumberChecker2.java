package com.methods;

public class NumberChecker2 {
	
    public static int[] getDigits(int num) {
        num = Math.abs(num);
        int[] digits = new int[countDigits(num)];
        int i = digits.length - 1;
        while (num > 0) {
            digits[i--] = num % 10;
            num /= 10;
        }
        return digits;
    }
    
    public static int countDigits(int num) {
        return String.valueOf(Math.abs(num)).length();
    }

    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    public static double sumOfSquares(int[] digits) {
        double sq = 0;
        for (int d : digits) sq += Math.pow(d, 2);
        return sq;
    }

    public static boolean isHarshad(int num) {
        int[] digs = getDigits(num);
        int sum = sumOfDigits(digs);
        return num % sum == 0 && sum != 0;
    }

    public static void main(String[] args) {
        int num = 21;
        int[] digits = getDigits(num);

        System.out.println("Number: " + num);
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares: " + (int) sumOfSquares(digits));
        System.out.println("Is Harshad? " + isHarshad(num));
    }
}