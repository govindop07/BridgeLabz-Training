package com.methods;

public class RandomFourDigits {

    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            // 1000 to 9999 inclusive
            arr[i] = 1000 + (int) (Math.random() * 9000);
        }
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        if (numbers.length == 0) return new double[0];

        int min = numbers[0];
        int max = numbers[0];
        long sum = 0;

        for (int num : numbers) {
            sum += num;
            if (num < min) min = num;
            if (num > max) max = num;
        }

        double avg = (double) sum / numbers.length;
        return new double[]{avg, min, max};
    }

    public static void main(String[] args) {
        int[] randoms = generate4DigitRandomArray(5);

        System.out.print("Generated 4-digit numbers: ");
        for (int n : randoms) System.out.print(n + " ");
        System.out.println();

        double[] stats = findAverageMinMax(randoms);

        System.out.printf("Average = %.2f%n", stats[0]);
        System.out.println("Minimum = " + (int) stats[1]);
        System.out.println("Maximum = " + (int) stats[2]);
    }
}