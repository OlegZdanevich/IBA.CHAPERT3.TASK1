package com.company;

import java.util.ArrayList;

public class Polynom {
    ArrayList<Fraction> coeff = new ArrayList<>();
    int power;

    Polynom(ArrayList<Fraction> args) {
        try {
            if (args.size() == 0) throw new NullPointerException("This must have parametrs");
            coeff.addAll(args);
            this.power = args.size() - 1;
        } catch (NullPointerException e) {
            StackTraceElement[] info = e.getStackTrace();
            for (int i = info.length - 1; i >= 0; i--) {
                System.err.println(info[i].toString());
            }
            System.err.println(e);
        }
    }

    public Fraction getCoeff(int power) {
        try {
            if (power > this.power) throw new IllegalArgumentException("Argument greater then power");
        } catch (IllegalArgumentException e) {
            StackTraceElement[] info = e.getStackTrace();
            for (int i = info.length - 1; i >= 0; i--) {
                System.err.println(info[i].toString());
            }
            System.err.println(e);
        }
        return coeff.get(power);
    }


    public int getPower() {
        return power;
    }

    @Override
    public String toString()
    {
        StringBuilder result=new StringBuilder("");
        for(int i=power;i>=0;i--)
        {
            if (i==0)
            {
                result.append("("+coeff.get(i).toString()+")x^"+(i));
                break;
            }
            result.append("("+coeff.get(i).toString()+")x^"+(i)+"+");

        }
        return result.toString();
    }

    public static Polynom sum(Polynom p1, Polynom p2) {
        ArrayList<Fraction> resultCoefficients = new ArrayList<>();
        if (p1.getPower() > p2.getPower()) {
            for (int i = 0; i <= p2.getPower(); i++) {
                resultCoefficients.add(Fraction.sum(p1.getCoeff(i), p2.getCoeff(i)));
            }
            for (int i = p2.getPower() + 1; i <= p1.getPower(); i++) {
                resultCoefficients.add(p1.getCoeff(i));
            }
        } else {
            if (p1.getPower() < p2.getPower()) {
                for (int i = 0; i <= p1.getPower(); i++) {
                    resultCoefficients.add(Fraction.sum(p1.getCoeff(i), p2.getCoeff(i)));
                }
                for (int i = p1.getPower() + 1; i <= p2.getPower(); i++) {
                    resultCoefficients.add(p2.getCoeff(i));
                }
            }
            else
            {
                for (int i = 0; i <= p1.getPower(); i++) {
                    resultCoefficients.add(Fraction.sum(p1.getCoeff(i), p2.getCoeff(i)));
                }
            }

        }
        return new Polynom(resultCoefficients);
    }
}
