package com.example;

public class CabInvoice {
    private static double FARE_PER_KM = 10.0;
    private static double FARE_PER_MINUTE = 1.0;
    private static double MINIMUM_FARE = 5.0;

    public double calculateFare(double distance, double time) {
        return Math.max(MINIMUM_FARE, ((distance * FARE_PER_KM) + (time * FARE_PER_MINUTE)));
    }

}