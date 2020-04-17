package com.github.iorioikawa.iori_dp.parsing;

public class Variable extends Value
{
    @Override
    public <T> T accept(IExpressionVisitor<T> visitor)
    {
        return visitor.visit(this);
    }
}
