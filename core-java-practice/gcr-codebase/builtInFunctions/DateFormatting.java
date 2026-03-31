package com.extras;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        System.out.println("Current date in different formats:");
        System.out.println(f1.format(today));
        System.out.println(f2.format(today));
        System.out.println(f3.format(today));
    }
}