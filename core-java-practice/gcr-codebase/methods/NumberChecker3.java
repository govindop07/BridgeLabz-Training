package com.methods;

public class NumberChecker3 {

    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        int[] digits = NumberCheck.getDigits(num);
        int[] reversed = reverseArray(digits);
        return arraysEqual(digits, reversed);
    }

    public static void main(String[] args) {
        int num = 1221;
        System.out.println(num + " is palindrome? " + isPalindrome(num));

        num = 12321;
        System.out.println(num + " is palindrome? " + isPalindrome(num));

        num = 1234;
        System.out.println(num + " is palindrome? " + isPalindrome(num));
    }
}