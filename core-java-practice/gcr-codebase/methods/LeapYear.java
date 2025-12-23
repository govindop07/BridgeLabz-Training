package com.methods;

import java.util.Scanner;

public class LeapYear {

    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            System.out.println("The year should be >= 1582");
            return false;
        }

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year to check: ");
        int year = sc.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        sc.close();
    }
}