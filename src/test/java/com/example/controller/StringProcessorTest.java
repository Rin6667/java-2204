package com.example.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringProcessorTest {

    @Test
    public void testReverseString() {
        StringProcessor processor = new StringProcessor();
        assertEquals("olleh", processor.reverseString("hello"), "Обратная строка 'hello' должна быть 'olleh'");
        assertThrows(IllegalArgumentException.class, () -> processor.reverseString(null),
                "Должно выбрасываться исключение для null строки");
    }

    @Test
    public void testCountVowels() {
        StringProcessor processor = new StringProcessor();
        assertEquals(5, processor.countVowels("education"), "Количество гласных в 'education' должно быть 5");
        assertEquals(0, processor.countVowels("bcdfg"), "В строке 'bcdfg' гласных нет");
        assertThrows(IllegalArgumentException.class, () -> processor.countVowels(null),
                "Должно выбрасываться исключение для null строки");
    }

    @Test
    public void testIsPalindrome() {
        StringProcessor processor = new StringProcessor();
        assertTrue(processor.isPalindrome("Madam"), "'Madam' является палиндромом");
        assertTrue(processor.isPalindrome("Step on no pets"), "'Step on no pets' является палиндромом");
        assertFalse(processor.isPalindrome("hello"), "'hello' не является палиндромом");
        assertThrows(IllegalArgumentException.class, () -> processor.isPalindrome(null),
                "Должно выбрасываться исключение для null строки");
    }
}
