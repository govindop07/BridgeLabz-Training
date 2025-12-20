package com.scenerio.based;

import java.util.Scanner;

//The Coffee Counter Chronicles
//Ravi runs a café. Each customer orders different coffee types with quantities. Write a program
//that:
//● Asks for coffee type (switch)
//● Calculates total bill (price * quantity)
//● Adds GST using arithmetic operators
//Use while to continue for the next customer and break when "exit" is typed.

public class CoffeeCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double GST_RATE = 0.05;

        while (true) {
            System.out.println("Enter coffee type i.e., espresso/latte/cappuccino or exit to stop:");
            String coffeeType = sc.nextLine();

            if (coffeeType.equals("exit")) {
                System.out.println("Closed.");
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            double pricePerCup;

            switch (coffeeType) {
                case "espresso":
                    pricePerCup = 120;
                    break;
                case "latte":
                    pricePerCup = 150;
                    break;
                case "cappuccino":
                    pricePerCup = 180;
                    break;
                default:
                    System.out.println("Invalid coffee type");
                    continue;
            }

            double totalPrice = pricePerCup * quantity;
            double gstAmount = totalPrice * GST_RATE;
            double totalBill = totalPrice + gstAmount;

            System.out.println("Total Price: ₹" + totalPrice);
            System.out.println("GST: ₹" + gstAmount);
            System.out.println("Total Bill: ₹" + totalBill);
        }
    }
}
