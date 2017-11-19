package com.company.Logic.Polynom;

import com.company.Exceptions.Exceptions;
import com.company.Logic.Fraction.Fraction;


import java.util.ArrayList;

public class Polynom {

    ArrayList<Fraction> coefficientsOfPolynom = new ArrayList<>();
    int maxPower;

    public Polynom(ArrayList<Fraction> args) {
        try {
            if (args.size() == 0) throw new NullPointerException("This must have parametrs");

            coefficientsOfPolynom.addAll(args);
            this.maxPower = args.size() - 1;

        } catch (NullPointerException exception) {

            Exceptions.noParametrException(exception);

            coefficientsOfPolynom.add(new Fraction(1,1));
        }
    }

    public Fraction getCoefficientsOfPolynom(int power) {
        try {
            if (power > this.maxPower) throw new IllegalArgumentException("Argument greater then power");

            return coefficientsOfPolynom.get(power);
        } catch (IllegalArgumentException exception) {

            Exceptions.notCorrectNumbersException(exception);

            return new Fraction(0,0);
        }
    }


    public int getMaxPower() {
        return maxPower;
    }

    @Override
    public String toString()
    {
        StringBuilder result=new StringBuilder("");
        for(int i=maxPower;i>=0;i--)
        {
            if (i==0)
            {
                result.append("("+coefficientsOfPolynom.get(i).toString()+")x^"+(i));
                break;
            }
            result.append("("+coefficientsOfPolynom.get(i).toString()+")x^"+(i)+"+");

        }
        return result.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Polynom)) return false;

        Polynom polynom = (Polynom) o;

        if (getMaxPower() != polynom.getMaxPower()) return false;
        return coefficientsOfPolynom.equals(polynom.coefficientsOfPolynom);
    }

    @Override
    public int hashCode() {
        int result = coefficientsOfPolynom.hashCode();
        result = 31 * result + getMaxPower();
        return result;
    }
}
