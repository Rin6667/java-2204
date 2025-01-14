package com.example.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    public void testMultiply() {
        MathUtils mathUtils = new MathUtils();
        int result = mathUtils.multiply(2, 3);
        assertEquals(6, result, "2 × 3 должно быть равно 6");
    }

    @Test
    public void testDivideThrowsException() {
        MathUtils mathUtils = new MathUtils();
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(10, 0),
                "Должно выбрасываться ArithmeticException при делении на 0");
    }
}

