package com.methods;

import java.util.Random;

public class FootballHeights {

    public static int[] generateHeights(int size) {
        Random rand = new Random();
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = 150 + rand.nextInt(101); // 150 to 250 cm
        }
        return heights;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int h : arr) sum += h;
        return sum;
    }

    public static double getMean(int[] arr) {
        return (double) getSum(arr) / arr.length;
    }

    public static int getShortest(int[] arr) {
        int min = arr[0];
        for (int h : arr) if (h < min) min = h;
        return min;
    }

    public static int getTallest(int[] arr) {
        int max = arr[0];
        for (int h : arr) if (h > max) max = h;
        return max;
    }

    public static void main(String[] args) {
        int[] team = generateHeights(11);

        System.out.print("Player heights (cm): ");
        for (int h : team) System.out.print(h + " ");
        System.out.println();

        System.out.println("Shortest player: " + getShortest(team) + " cm");
        System.out.println("Tallest player: " + getTallest(team) + " cm");
        System.out.printf("Mean height: %.1f cm", getMean(team));
    }
}
