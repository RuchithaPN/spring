package com.eureka;



public class BasalMetabolicRateCalculator {

public static double calculate(int age, String gender, double height, double weight) {
    double bmr;
    // Validate gender input
    if (gender == null || gender.isEmpty()) {
        throw new IllegalArgumentException("Gender cannot be null ");
    }
    // Calculate basal metabolic rate based on gender - Mifflin - St Jeor Equation
    if (gender.equalsIgnoreCase("M")) {
        bmr = (10 * weight) + (6.25 * height) -(5 * age) + 5;
    } else {
        bmr = (10 * weight) + (6.25 * height) - (5 * age) - 161;
    }
    return bmr;
}
}