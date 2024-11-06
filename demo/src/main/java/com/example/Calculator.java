package com.example;

import java.util.logging.Logger;

public class Calculator {
            private static final Logger LOGGER = Logger.getLogger(Calculator.class.getName());
    
    public static Complex add(Complex x, Complex y) {
        LOGGER.info("Add complex numbers " + x + " and " + y + ".");
        Complex sum= x.add(y);
        LOGGER.info("Result: " + sum);

        return sum;
    }

    public static Complex multiply(Complex x, Complex y) {
        LOGGER.info("Multiply complex numbers " + x + " and " + y + ".");
        Complex product = x.multiply(y);
        LOGGER.info("Result: " + product);

        return product;
    }

    public static Complex divide(Complex x, Complex y) {
        if (y.getReal() == 0 && y.getImagine() == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        LOGGER.info("Divide complex numbers " + x + " and " + y + ".");
        Complex quotient = x.divide(y);
        LOGGER.info("Result: " + quotient);

        return quotient;
    
    }

public static Complex substruction(Complex x, Complex y){
    LOGGER.info("Substruction complex numbers " + x + " and " + y + ".");
    Complex result = x.substruction(y);
    LOGGER.info("Result: " + result);

    return result;

}
}
