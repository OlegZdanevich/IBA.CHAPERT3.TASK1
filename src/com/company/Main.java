package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        //Some Tests
        ArrayList<Fraction>coeff1=new ArrayList<>();
        coeff1.add(new Fraction(1,2));
        coeff1.add(new Fraction(1,4));
        coeff1.add(new Fraction(1,6));
        coeff1.add(new Fraction(1,8));
        ArrayList<Fraction>coeff2=new ArrayList<>();
        coeff2.add(new Fraction(1,2));
        coeff2.add(new Fraction(1,6));
        coeff2.add(new Fraction(1,10));
        coeff2.add(new Fraction(1,14));
        ArrayList<Fraction>coeff3=new ArrayList<>();
        coeff3.add(new Fraction(1,2));
        coeff3.add(new Fraction(1,8));
        coeff3.add(new Fraction(1,14));
        coeff3.add(new Fraction(1,20));
        Polynom polynom1=new Polynom(coeff1);
        Polynom polynom2=new Polynom(coeff2);
        Polynom polynom3=new Polynom(coeff3);
        Polynom result=Polynoms.sum(polynom1,polynom2,polynom3);
        System.out.println(result);

    }
}
