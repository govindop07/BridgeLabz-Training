package com.methods;

import java.util.Scanner;

public class HandshakeProblem {
    
    static int maxHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students are there? ");
        int students = sc.nextInt();
        
        if (students < 2) {
            System.out.println("Not enough people for handshakes :(");
        } else {
            System.out.println("Maximum possible handshakes = " + maxHandshakes(students));
        }
        
        sc.close();
    }
}