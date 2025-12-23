package com.methods;

import java.util.Scanner;

public class FindMinimumAndMaximum {
    
    public static int[] findSmallestAndLargest(int x, int y, int z) {
        int smallest = Math.min(x, Math.min(y, z));
        int largest  = Math.max(x, Math.max(y, z));
        return new int[]{smallest, largest};
    }
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Number 1: ");
        int a = sc.nextInt();
        System.out.print("Number 2: ");
        int b = sc.nextInt();
        System.out.print("Number 3: ");
        int c = sc.nextInt();
        
        int[] result = findSmallestAndLargest(a, b, c);
        
        System.out.println("Smallest: " + result[0]);
        System.out.println("Largest: " + result[1]);
        
        sc.close();
    }
}