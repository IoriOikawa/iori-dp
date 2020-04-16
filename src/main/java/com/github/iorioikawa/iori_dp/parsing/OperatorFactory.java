package com.github.iorioikawa.iori_dp.parsing;

public final class OperatorFactory
{
    private OperatorFactory()
    {
    }

    public static Operator create(String s)
    {
        if (s.equals("+"))
            return new OpAdd();
        if (s.equals("-"))
            return new OpSubtract();
        if (s.equals("*"))
            return new OpMultiply();
        if (s.equals("/"))
            return new OpDivide();
        if (s.equals(">"))
            return new OpGreaterThan();
        if (s.equals("<"))
            return new OpLessThan();
        if (s.equals("=="))
            return new OpEqualsTo();
        if (s.equals("/\\"))
            return new OpAnd();
        if (s.equals("\\/"))
            return new OpOr();
        if (s.equals("->"))
            return new OpImply();

        throw new IllegalSyntaxException(s);
    }
}
