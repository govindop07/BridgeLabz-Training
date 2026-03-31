package com.methods;

import java.util.Scanner;

public class NumberSignCheck {
    
    static int getSign(int num) {
        if (num > 0) return 1;
        if (num < 0) return -1;
        return 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer: ");
        int number = sc.nextInt();
        
        int result = getSign(number);
        
        switch(result) {
            case 1  : 
            	System.out.println("Positive number");
            	break;
            case -1 :
            	System.out.println("Negative number");
            	break;
            default :
            	System.out.println("It's zero");
            	break;
        }
        
        sc.close();
    }
}