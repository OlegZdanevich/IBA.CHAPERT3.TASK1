package com.company.Run;

import com.company.Exceptions.Exceptions;
import com.company.Fraction.Fraction;
import com.company.Polynom.Polynom;
import com.company.Polynom.Polynoms;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Polynom[] arrOfPolynoms = null;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter number of polynoms:");
            int numberOfPolynoms = Integer.parseInt(input.next());

            if (numberOfPolynoms <= 0)
                throw new IllegalArgumentException("Number of polynoms should be greater then zero");

            arrOfPolynoms = new Polynom[numberOfPolynoms];

            for (int i = 0; i < numberOfPolynoms; i++) {
                arrOfPolynoms[i] = createPolynom();
            }

            System.out.println("Polinoms:");

            for (int i = 0; i < numberOfPolynoms; i++) {
                System.out.println((i + 1) + ") " + arrOfPolynoms[i]);
            }

            System.out.println("Result of the sum:");

            System.out.println(Polynoms.sum(arrOfPolynoms));
        }
        catch (NumberFormatException exception) {
            Exceptions.notNumberException(exception);
        }
        catch (NullPointerException exception) {
            Exceptions.notInitializedException(exception);
        }
        catch (IllegalArgumentException exception) {
            Exceptions.notCorrectNumbersException(exception);
        }


    }

    private static Polynom createPolynom() throws IllegalArgumentException {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of elements in polynom:");
        int numberOfElements = Integer.parseInt(input.next());

        if (numberOfElements <= 0)
            throw new IllegalArgumentException("Number of elements in polynom should be greater then zero");

        ArrayList<Fraction> koefficientsOfPolynom = new ArrayList<>();

        for (int i = 0; i < numberOfElements; i++) {
            System.out.println("x^" + i + " :");

            System.out.print("numerator:");
            int numerator = Integer.parseInt(input.next());

            System.out.print("denominator:");
            int denominator = Integer.parseInt(input.next());

            koefficientsOfPolynom.add(new Fraction(numerator, denominator));
        }

        return new Polynom(koefficientsOfPolynom);
    }
}
