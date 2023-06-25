package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for simple App.
 */
public class AppTest{



    @BeforeAll

    static void multiplication() {

        Calculator calculator = new Calculator();
        double result = calculator.multiplication(5, 2);
        assertEquals(10, result);
    }

    @BeforeAll
    static void division() {
        Calculator calculator = new Calculator();
        double result = calculator.division(10, 5, 0.001);
        assertEquals(2, result <= 0.001);
    }



}
