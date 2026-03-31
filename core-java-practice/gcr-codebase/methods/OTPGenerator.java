package com.methods;

import java.util.HashSet;
import java.util.Random;

public class OTPGenerator {

    public static String generate6DigitOTP() {
        Random rand = new Random();
        int num = 100000 + rand.nextInt(900000); // 100000 to 999999
        return String.format("%06d", num);
    }

    public static boolean allUnique(String[] otps) {
        HashSet<String> seen = new HashSet<>();
        for (String otp : otps) {
            if (!seen.add(otp)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] otps = new String[10];
        System.out.println("Generating 10 OTPs...");

        for (int i = 0; i < 10; i++) {
            otps[i] = generate6DigitOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }

        System.out.println("\nAll OTPs unique? " + allUnique(otps));
    }
}