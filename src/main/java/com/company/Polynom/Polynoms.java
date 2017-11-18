package com.company.Polynom;

import com.company.Exceptions.Exceptions;
import com.company.Fraction.Fraction;

import java.util.ArrayList;

public class Polynoms
{
    public static Polynom sum(Polynom... args)
    {
        try {

            if (args.length == 0) throw new NullPointerException("This should have parametrs");

            if(args.length==1)
            {
                return args[0];
            }

            Polynom buffer=PolynomTools.sum(args[0],args[1]);

            for(int i=2;i<args.length;i++)
            {
                buffer=PolynomTools.sum(buffer,args[i]);
            }
            return buffer;

        }
        catch (NullPointerException exception) {

            Exceptions.noParametrException(exception);

            ArrayList<Fraction> errorReturnParametrs=new ArrayList<>();
            errorReturnParametrs.add(new Fraction(1,1));
            return new Polynom(errorReturnParametrs);
        }
    }
}
