package ru_synergy.encapsulationTest;

class Fraction {
    int numerator;
    int denominator = 1;

    public Fraction() {
        if (denominator == 0) System.out.println("Denominator cannot be zero.");
        return;
    }

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator cannot be zero.");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }
}
