package com.methods;

//Extend or Create a NumberChecker utility class and perform following task. Call from main() method the different methods and display results. Make sure all are static methods
//Hint => 
//Method to Find the count of digits in the number
//Method to Store the digits of the number in a digits array
//Method to Check if a number is a duck number using the digits array. A duck number is a number that has a non-zero digit present in it
//Method to check if the number is a armstrong number using the digits array. ​​Armstrong number is a number that is equal to the sum of its own digits raised to the power of the number of digits. Eg: 153 = 1^3 + 5^3 + 3^3
//Method to find the largest and second largest elements in the digits array. Use Integer.MIN_VALUE to initialize the variable.
//Method to find the the smallest and second smallest elements in the digits array. Use Integer.MAX_VALUE to initialize the variable.

public class NumberCheck {

    public static int countDigits(int num) {
        return String.valueOf(Math.abs(num)).length();
    }

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

    public static boolean isDuckNumber(int num) {
        int[] digits = getDigits(num);
        for (int d : digits) {
            if (d != 0) return true;
        }
        return false;
    }

    public static boolean isArmstrong(int num) {
        int[] digits = getDigits(num);
        int n = digits.length;
        long sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        return sum == Math.abs(num);
    }

    public static int[] findLargestAndSecond(int[] digits) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }

    public static void main(String[] args) {
        int test = 153;
        int[] digs = getDigits(test);

        System.out.println("Number: " + test);
        System.out.print("Digits: ");
        for (int d : digs) System.out.print(d + " ");
        System.out.println();

        System.out.println("Duck?" + isDuckNumber(test));
        System.out.println("Armstrong?" + isArmstrong(test));

        int[] big = findLargestAndSecond(digs);
        System.out.println("Largest digit: " + big[0]);
        System.out.println("2nd largest : " + big[1]);
    }
}