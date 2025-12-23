package com.extras;

import java.time.ZonedDateTime;
import java.time.ZoneId;

public class CurrentTimeInZones {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();

        ZonedDateTime gmt = now.withZoneSameInstant(ZoneId.of("GMT"));
        ZonedDateTime ist = now.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst = now.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));

        System.out.println("Current time in different zones:");
        System.out.println("GMT : " + gmt.toLocalDateTime());
        System.out.println("IST : " + ist.toLocalDateTime());
        System.out.println("PST : " + pst.toLocalDateTime());
    }
}