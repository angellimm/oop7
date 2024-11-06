package com.example;

public class Complex {
   private double real;
   private double imagine;

    public Complex (double real, double imgaine){
        this.real = real;
        this.imagine = imgaine;

    }

    public double getReal() {
        return this.real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImagine() {
        return this.imagine;
    }

    public void setImagine(double imagine) {
        this.imagine = imagine;
    }
// операции с комплесными числами
    public Complex add (Complex other) {
        double realSum = this.real + other.real;
        double imSum = this.imagine + other.imagine;

        return new Complex(realSum, imSum);

    }

    public Complex substruction (Complex other){
        double realSub = this.real - other.real;
        double imSub = this.imagine - other.imagine;

        return new Complex(realSub, imSub);
    }

    public Complex multiply(Complex other) {
        double realMultiply = this.real + other.real;
        double imMultiply = this.imagine + other.imagine;

        return new Complex(realMultiply, imMultiply);

    }

    public Complex divide(Complex other) {
        double denominator = other.real * other.real + other.imagine * other.imagine;
        double realDivider = (this.real *other.real + this.imagine * other.imagine) / denominator;
        double imDivider = (this.imagine * other.real - this.real * other.imagine) / denominator;

        return new Complex(realDivider, imDivider);
}

@Override 
public String toString(){
    if (imagine >= 0) {
        return real + " + " + imagine + "i";
    
    } else {
        return real + " - " + Math.abs(imagine) + "i";
        }
}
}