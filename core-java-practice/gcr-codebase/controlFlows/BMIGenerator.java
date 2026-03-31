package com.control.flow;

import java.util.Scanner;

public class BMIGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter the height in cm: ");
        double heightCm = sc.nextDouble();

        double heightMeter = heightCm / 100;
        double bmi = weight / (heightMeter * heightMeter);

        if (bmi <= 18.4) {
            System.out.println("BMI is: " + bmi);
            System.out.println("Status: Underweight");
            
        } else if (bmi >= 18.5 && bmi <= 24.9) {
        	System.out.println("BMI is: " + bmi);
        	System.out.println("Status: Normal");
        	
        } else if (bmi >= 25.0 && bmi <= 39.9) {
        	System.out.println("BMI is: " + bmi);
        	System.out.println("Status: Overweight");
        } else {
        	System.out.println("BMI is: " + bmi);
        	System.out.println("Status: Obese");
        }

    }
}
