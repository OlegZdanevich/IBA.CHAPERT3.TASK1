package com.company.Fraction;


import com.company.Exceptions.Exceptions;

public class Fraction {
    private long denominator;
    private long numerator;


    public Fraction(long numerator, long denominator) {
        try {
            if (denominator == 0) throw new ArithmeticException("Divsion by zero");

            this.numerator = numerator;
            this.denominator = denominator;
        }
        catch (ArithmeticException arithmeticException) {

            Exceptions.divisionByZero(arithmeticException);
            this.denominator=1;
        }


    }

    public Fraction(Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }

    public long getDenominator() {
        return denominator;
    }

    public long getNumerator() {
        return numerator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Fraction fraction = (Fraction) o;

        if (getDenominator() != fraction.getDenominator()) return false;
        return getNumerator() == fraction.getNumerator();
    }

    @Override
    public int hashCode() {
        int result = (int) (getDenominator() ^ (getDenominator() >>> 32));
        result = 31 * result + (int) (getNumerator() ^ (getNumerator() >>> 32));
        return result;
    }
}
