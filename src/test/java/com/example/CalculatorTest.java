package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();

        int result = calculator.add(2, 3);

        assertEquals(5, result);
    }

    @Test
    void testMultiplication() {
        Calculator calculator = new Calculator();

        int result = calculator.multiply(4, 5);

        assertEquals(20, result);
    }
}