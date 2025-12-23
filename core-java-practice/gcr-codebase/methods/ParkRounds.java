package com.methods;

import java.util.Scanner;

public class ParkRounds {
    
    static double getRoundsNeeded(double a, double b, double c) {
        double perimeter = a + b + c;
        return 5000.0 / perimeter;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the three sides of the triangular park (in meters):");
        double s1 = sc.nextDouble();
        double s2 = sc.nextDouble();
        double s3 = sc.nextDouble();
        
        double rounds = getRoundsNeeded(s1, s2, s3);
        
        System.out.printf("To run 5 km, the athlete needs to complete approximately %.2f rounds", rounds);
        
        sc.close();
    }
}