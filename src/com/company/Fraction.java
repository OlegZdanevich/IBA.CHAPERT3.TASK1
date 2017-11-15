package com.company;

public class Fraction {
    private int denominator;
    private int numerator;
    Fraction(int numerator,int denominator)
    {
        this.numerator=numerator;
        this.denominator=denominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    @Override
    public String toString()
    {
        return numerator+"/"+denominator;
    }
    public static Fraction sum(Fraction f1,Fraction f2)
    {
        int denominator=f1.getDenominator()*f2.getDenominator();
        int numerator=f1.getNumerator()*f2.getDenominator()+f2.getNumerator()*f1.getDenominator();
        return new Fraction(numerator,denominator);
    }
}
