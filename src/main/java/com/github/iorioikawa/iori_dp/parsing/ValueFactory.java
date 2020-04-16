package com.github.iorioikawa.iori_dp.parsing;

public final class ValueFactory
{
    private ValueFactory()
    {
    }

    public static Value create(String s)
    {
        if (s.equals("x"))
            return new Variable();

        if (s.equals("true"))
            return new BooleanConstant(true);
        if (s.equals("false"))
            return new BooleanConstant(false);

        double c = Double.parseDouble(s);
        return new NumericConstant(c);
    }
}
