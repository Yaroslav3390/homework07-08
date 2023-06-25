package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    @Test
    void add() {

        Calculator calculator = new Calculator();
        int result = calculator.add(20, 30);
        assertEquals(50, result);

    }

    @Test
    void subtraction() {
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(50, 20);
        assertEquals(30, result);
    }

    @Test
    void addNegative() {

        Calculator calculator = new Calculator();
        int result = calculator.add(20, 30);
        assertNotEquals(40, result);
    }
    @Test
    void subtractionNegative() {
        Calculator calculator = new Calculator();
        int result = calculator.subtraction(50, 20);
        assertNotEquals(20, result);
    }




}