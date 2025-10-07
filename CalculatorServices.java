package com.Junit.testing;

public class CalculatorServices {

    public static int addToNumbers(int a, int b) {
        return a + b;
    }

    public static int productTwoNumbers(int a, int b) {
        return a * b;
    }

    public static int divideTwoNumbers(int a, int b) {
        return a / b;
    }

    public static int sumTwoNumbers(int... numbers) {

        int s = 0;
        for (int n : numbers)
            s += n;

        return s;


    }
}