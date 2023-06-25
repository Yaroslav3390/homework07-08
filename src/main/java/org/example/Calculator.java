package org.example;

public class Calculator {

    public int add(int num1, int num2){
        int result;
        result = num1 + num2;
        return result;

        }
    public int subtraction(int num1, int num2){

        int result;
        result = num1 - num2;

        return result;

    }

    public double multiplication(double num1, double num2) {

        double result;
        result = num1 * num2;

        return result;
    }

    public double division(double num1, double num2, double delta) {
        double result;
        result = num1 / num2;
        return result;
    }
}
