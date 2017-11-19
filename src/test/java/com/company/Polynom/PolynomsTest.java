package com.company.Polynom;

import com.company.Logic.Fraction.Fraction;
import com.company.Logic.Polynom.Polynom;
import com.company.Logic.Polynom.Polynoms;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class PolynomsTest {
    private Polynom polynom1=null;
    private Polynom polynom2=null;
    private Polynom polynom3=null;

    @Before
    public void setUp() {
        ArrayList<Fraction> coeff1 = new ArrayList<>();
        coeff1.add(new Fraction(1, 2));
        coeff1.add(new Fraction(1, 4));
        coeff1.add(new Fraction(1, 6));
        coeff1.add(new Fraction(1, 8));

        ArrayList<Fraction> coeff2 = new ArrayList<>();
        coeff2.add(new Fraction(1, 2));
        coeff2.add(new Fraction(1, 6));
        coeff2.add(new Fraction(1, 10));
        coeff2.add(new Fraction(1, 14));

        ArrayList<Fraction> coeff3 = new ArrayList<>();
        coeff3.add(new Fraction(1, 2));
        coeff3.add(new Fraction(1, 8));
        coeff3.add(new Fraction(1, 14));
        coeff3.add(new Fraction(1, 20));

        polynom1 = new Polynom(coeff1);
        polynom2 = new Polynom(coeff2);
        polynom3 = new Polynom(coeff3);
    }

    @After
    public void tearDown() {
        polynom1=null;
        polynom2=null;
        polynom3=null;
    }

    @Test
    public void sum() {
        assertEquals("(552/2240)x^3+(284/840)x^2+(104/192)x^1+(12/8)x^0", Polynoms.sum(polynom1,polynom2,polynom3).toString());

        assertEquals("(22/112)x^3+(16/60)x^2+(10/24)x^1+(4/4)x^0",Polynoms.sum(polynom1,polynom2).toString());

        assertEquals("(28/160)x^3+(20/84)x^2+(12/32)x^1+(4/4)x^0",Polynoms.sum(polynom1,polynom3).toString());

        assertEquals("(34/280)x^3+(24/140)x^2+(14/48)x^1+(4/4)x^0",Polynoms.sum(polynom2,polynom3).toString());

        assertEquals("(1/14)x^3+(1/10)x^2+(1/6)x^1+(1/2)x^0",Polynoms.sum(polynom2).toString());

        assertEquals("(1/1)x^0",Polynoms.sum().toString());
    }

}