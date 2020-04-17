package com.github.iorioikawa.iori_dp.parsing;

public abstract class Expression
{
    public abstract <T> T accept(IExpressionVisitor<T> visitor);
}
