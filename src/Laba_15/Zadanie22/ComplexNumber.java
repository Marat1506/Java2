package Laba_15.Zadanie22;

import java.io.InputStreamReader;
import java.util.Objects;
import java.util.Scanner;

public class ComplexNumber {
    private double real;
    private double mnimoe;

    public ComplexNumber(double real, double mnimoe) {
        this.real = real;
        this.mnimoe = mnimoe;
    }


    public void add(double a, double b) {
        this.real += a;
        this.mnimoe += b;
    }

    public void multiply(double a, double b) {
        double newReal = this.real * a - this.mnimoe * b;
        double newImaginary = this.real * b + this.mnimoe * a;
        this.real = newReal;
        this.mnimoe = newImaginary;
    }
    public String toString() {
        return real + " + " + mnimoe + "i";
    }
    public double getReal() {
        return real;
    }

    public double getMnimoe() {
        return mnimoe;
    }

    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(1, 3);
        ComplexNumber num2 = new ComplexNumber(1, 4);

        num1.add(num2.getReal(), num2.getMnimoe());
        System.out.println("Сумма: " + num1);

        num1.multiply(num2.getReal(), num2.getMnimoe());
        System.out.println("Произведение: " + num1);
    }
}