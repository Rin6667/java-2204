package com.example.controller;

public class AdvancedMathUtils {

    public double calculateSquareRoot(double number) {
        if (number < 0) {
            throw new NegativeNumberException("Square root of a negative number is undefined");
        }
        return Math.sqrt(number);
    }

    public double calculateLogarithm(double number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Logarithm is undefined for non-positive numbers");
        }
        return Math.log10(number);
    }

    public double calculateNthRoot(double number, int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Root degree must be greater than zero");
        }
        return Math.pow(number, 1.0 / n);
    }
}

class NegativeNumberException extends RuntimeException {
    public NegativeNumberException(String message) {
        super(message);
    }
}
