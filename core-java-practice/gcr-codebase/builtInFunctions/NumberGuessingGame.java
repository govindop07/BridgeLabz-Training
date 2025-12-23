package com.extras;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100. I'll try to guess it!");
        playGame();
    }

    public static void playGame() {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int low = 1;
        int high = 100;
        int guess;
        String feedback;

        do {
            guess = low + rand.nextInt(high - low + 1);
            System.out.println("My guess: " + guess);
            System.out.print("Is it high, low, or correct? ");
            feedback = sc.next().toLowerCase();

            if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            }
        } while (!feedback.equals("correct"));

        System.out.println("Yes! I guessed it. Your number was " + guess);
    }
}
