package com.company;

/**
 * Created by jonny1846 on 1/23/2017.
 */
public class calcFeetAndInchesToCentimeters {
    public static final double feet = 6.0;
    public static final double inches = 0.0;

    public static void main(String[] args) {
        System.out.println("Total Number one in cm.: " + calculateFeetAndInches(feet, inches) + " centimeters");
        System.out.println("Total Number two in cm.: " + calculateTwo(inches) + " centimeters");
    }

    public static double calculateFeetAndInches(double feet, double inches) {
        if ((feet <= 0) || (inches <0 || inches >= 12)) return -1.0;
        double feetInches = feet*12;
        double total = feetInches + inches;
        double cm = total * 2.54;
        return cm;
    }

    private static double calculateTwo(double inches) {
        if (inches < 0) return -1.0;
        double cm = calculateFeetAndInches(inches);
        return cm;
    }

    public static double calculateFeetAndInches(double inches) {
        if ((inches <=0 || inches >= 12)) return -1.0;
        double total = inches;
        double cm = total * 2.54;
        return cm;
    }
    public static double getFeet()
    {
        return feet;
    }
    public static double getInches()
    {
        return inches;
    }
}
