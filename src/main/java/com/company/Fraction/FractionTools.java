package com.company.Fraction;

public abstract class FractionTools {
    public static Fraction sum(Fraction f1, Fraction f2) {

        long denominator = f1.getDenominator() * f2.getDenominator();
        long numerator = f1.getNumerator() * f2.getDenominator() + f2.getNumerator() * f1.getDenominator();

        return new Fraction(numerator, denominator);
    }

}
