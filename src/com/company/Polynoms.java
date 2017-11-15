package com.company;

public class Polynoms
{
    public static Polynom sum(Polynom... args)
    {
        try {
            if (args.length == 0) throw new NullPointerException("This must have parametrs");
        } catch (NullPointerException e) {
            StackTraceElement[] info = e.getStackTrace();
            for (int i = info.length - 1; i >= 0; i--) {
                System.err.println(info[i].toString());
            }
            System.err.println(e);
        }
        if(args.length==1)
        {
            return args[0];
        }
        Polynom buffer=Polynom.sum(args[0],args[1]);
        for(int i=2;i<args.length;i++)
        {
            buffer=Polynom.sum(buffer,args[i]);
        }
        return buffer;
    }
}
