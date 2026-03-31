package com.methods;

import java.util.Scanner;

public class NaturalSum {
    
    static long sumOfN(int n) {
        long sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Up to which number do you want the sum? ");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a positive number");
        } else {
            System.out.println("Sum of first " + n + " natural numbers = " + sumOfN(n));
        }
        
        sc.close();
    }
}