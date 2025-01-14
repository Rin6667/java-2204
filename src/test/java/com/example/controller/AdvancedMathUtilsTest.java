package com.example.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdvancedMathUtilsTest {

    @Test
    public void testCalculateSquareRoot() {
        AdvancedMathUtils utils = new AdvancedMathUtils();
        assertEquals(2.0, utils.calculateSquareRoot(4), "Квадратный корень из 4 должен быть 2");
        assertThrows(NegativeNumberException.class, () -> utils.calculateSquareRoot(-1),
                "Должно выбрасываться исключение для отрицательных чисел");
    }

    @Test
    public void testCalculateLogarithm() {
        AdvancedMathUtils utils = new AdvancedMathUtils();
        assertEquals(1.0, utils.calculateLogarithm(10), "Логарифм от 10 должен быть 1");
        assertThrows(IllegalArgumentException.class, () -> utils.calculateLogarithm(0),
                "Должно выбрасываться исключение для чисел <= 0");
    }

    @Test
    public void testCalculateNthRoot() {
        AdvancedMathUtils utils = new AdvancedMathUtils();
        assertEquals(3.0, utils.calculateNthRoot(27, 3), "Кубический корень из 27 должен быть 3");
        assertThrows(IllegalArgumentException.class, () -> utils.calculateNthRoot(27, 0),
                "Должно выбрасываться исключение для n <= 0");
    }
}
