package com.company.Polynom;

import com.company.Fraction.Fraction;
import com.company.Fraction.FractionTools;

import java.util.ArrayList;

public abstract class PolynomTools {

    public static Polynom sum(Polynom polynom1, Polynom polynom2) {
        ArrayList<Fraction> resultCoefficients = new ArrayList<>();

        if (polynom1.getMaxPower() > polynom2.getMaxPower()) {

            for (int i = 0; i <= polynom2.getMaxPower(); i++) {
                resultCoefficients.add(FractionTools.sum(polynom1.getCoefficientsOfPolynom(i), polynom2.getCoefficientsOfPolynom(i)));
            }

            for (int i = polynom2.getMaxPower() + 1; i <= polynom1.getMaxPower(); i++) {
                resultCoefficients.add(polynom1.getCoefficientsOfPolynom(i));
            }
        } else {

            if (polynom1.getMaxPower() < polynom2.getMaxPower()) {

                for (int i = 0; i <= polynom1.getMaxPower(); i++) {
                    resultCoefficients.add(FractionTools.sum(polynom1.getCoefficientsOfPolynom(i), polynom2.getCoefficientsOfPolynom(i)));
                }

                for (int i = polynom1.getMaxPower() + 1; i <= polynom2.getMaxPower(); i++) {
                    resultCoefficients.add(polynom2.getCoefficientsOfPolynom(i));
                }
            } else {

                for (int i = 0; i <= polynom1.getMaxPower(); i++) {
                    resultCoefficients.add(FractionTools.sum(polynom1.getCoefficientsOfPolynom(i), polynom2.getCoefficientsOfPolynom(i)));
                }

            }

        }
        return new Polynom(resultCoefficients);
    }

}
