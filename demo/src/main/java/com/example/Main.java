package com.example;

public class Main {
    public static void main(String[] args) {

        Complex num1 = new Complex(2, 3); // ввод чисел
        Complex num2 = new Complex(3, 0);

        Calculator.add(num1, num2);
        Calculator.divide(num1, num2);
        Calculator.multiply(num1, num2);
        Calculator.substruction(num1, num2);

    }
}