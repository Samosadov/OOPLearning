package ru_synergy.constructorTest;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator can't be zero.");
            return;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction addToNumerator() {
        this.numerator++;
        return this;
    }

    public Fraction getObjectCurrent() { return this; }

    @Override
    public String toString() {
        return "Fraction{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
