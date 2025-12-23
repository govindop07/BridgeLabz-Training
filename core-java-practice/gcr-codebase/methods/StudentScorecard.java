package com.methods;

import java.util.Random;

public class StudentScorecard {

    public static int[][] generatePCMScores(int students) {
        Random rand = new Random();
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            scores[i][0] = 40 + rand.nextInt(61); // Physics 40-100
            scores[i][1] = 40 + rand.nextInt(61);
            scores[i][2] = 40 + rand.nextInt(61);
        }
        return scores;
    }

    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4]; // total, avg, %
        for (int i = 0; i < scores.length; i++) {
            int tot = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = tot / 3.0;
            double perc = (tot / 300.0) * 100;

            results[i][0] = tot;
            results[i][1] = Math.round(avg * 100) / 100.0;
            results[i][2] = Math.round(perc * 100) / 100.0;
            results[i][3] = scores[i][0] + scores[i][1] + scores[i][2]; // for display
        }
        return results;
    }

    public static void printScorecard(int[][] scores, double[][] results) {
        System.out.println("Stud\tPhy\tChem\tMath\tTotal\tAvg\t%");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f%%%n",
                    i + 1,
                    scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2]);
        }
    }

    public static void main(String[] args) {
        int students = 8;
        int[][] marks = generatePCMScores(students);
        double[][] stats = calculateResults(marks);
        printScorecard(marks, stats);
    }
}