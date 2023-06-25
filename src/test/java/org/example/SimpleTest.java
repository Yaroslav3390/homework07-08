package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SimpleTest {

    @Test

    public void twoValuesAreEqual(){
        int a = 2;
        int b = 2;

        assertSame(a,b);
    }
    @Test

    public void twoValuesAreNotEqual(){
        int a = 3;
        int b = 2;

        assertNotSame(a, b);
    }
    @Test

    public void stringIsNotEmpty(){


        String st2 = "True";

        assertNotNull(st2);



    }
}