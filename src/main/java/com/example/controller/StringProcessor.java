package com.example.controller;

public class StringProcessor {

    public String reverseString(String input) {
        if (input == null || input.isEmpty()) {
            throw new IllegalArgumentException("Input string cannot be null or empty");
        }
        return new StringBuilder(input).reverse().toString();
    }

    public int countVowels(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        return (int) input.toLowerCase().chars()
                .filter(c -> "aeiou".indexOf(c) != -1).count();
    }

    public boolean isPalindrome(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        String cleanInput = input.replaceAll("\\s+", "").toLowerCase();
        return cleanInput.equals(new StringBuilder(cleanInput).reverse().toString());
    }
}

