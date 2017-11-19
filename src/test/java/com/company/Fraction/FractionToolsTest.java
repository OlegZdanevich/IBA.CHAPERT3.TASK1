package com.company.Fraction;

import com.company.Logic.Fraction.Fraction;
import com.company.Logic.Fraction.FractionTools;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FractionToolsTest {
    Fraction fraction1=null;
    Fraction fraction2=null;
    Fraction fraction3=null;
    @Before
    public void setUp() {
        fraction1=new Fraction(1,1);

        fraction2=new Fraction(1,2);

        fraction3=new Fraction(2,8);
    }

    @After
    public void tearDown() {
        fraction1=null;
        fraction2=null;
        fraction3=null;
    }

    @Test
    public void sum() {
        assertEquals("3/2", FractionTools.sum(fraction1,fraction2).toString());
        assertEquals("10/8",FractionTools.sum(fraction1,fraction3).toString());
        assertEquals("12/16",FractionTools.sum(fraction2,fraction3).toString());
    }

}