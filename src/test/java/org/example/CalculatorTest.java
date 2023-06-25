package org.example;

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
     void multiplication() {

        Calculator calculator = new Calculator();
        double result = calculator.multiplication(5,2);
        assertEquals(10, result);
    }

    @Test
    void division() {
        Calculator calculator = new Calculator();
        double result = calculator.division(10.0, 2.0);
        assertEquals(5.0, result);
    }
}