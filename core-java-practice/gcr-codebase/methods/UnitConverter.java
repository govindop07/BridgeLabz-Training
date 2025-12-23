package com.methods;

public class UnitConverter {

    public static double kmToMiles(double km) {
        return km * 0.621371;
    }

    public static double milesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double feetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static double poundsToKg(double pounds) {
        return pounds * 0.453592;
    }

    public static double kgToPounds(double kg) {
        return kg * 2.20462;
    }

    public static void main(String[] args) {
        System.out.println("100 km = " + kmToMiles(100) + " miles");
        System.out.println("98.6°F = " + fahrenheitToCelsius(98.6) + " °C");
        System.out.println("70 kg = " + kgToPounds(70) + " pounds");
    }
}