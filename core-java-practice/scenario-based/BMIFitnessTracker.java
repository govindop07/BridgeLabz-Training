package com.scenerio.based;

import java.util.Scanner;

//. Maya’s BMI Fitness Tracker
//Maya, a fitness coach, wants to record the BMI of her clients.
//● Ask for height and weight.
//● Use formula BMI = weight / (height * height)
//● Print category using if-else: Underweight, Normal, Overweight.
//Use clear variable names and comments to maintain code hygiene.

public class BMIFitnessTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the height in meters: ");
        double heightInMeters = sc.nextDouble();

        System.out.print("Enter the weight in kilograms: ");
        double weightInKg = sc.nextDouble();

        double bmi = weightInKg / (heightInMeters * heightInMeters);

        System.out.println("Your BMI is: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Category: Underweight");
        } else if (bmi < 25) {
            System.out.println("Category: Normal");
        } else {
            System.out.println("Category: Overweight");
        }

        sc.close();
    }

}
