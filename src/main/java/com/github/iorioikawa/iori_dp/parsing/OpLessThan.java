package com.github.iorioikawa.iori_dp.parsing;

public class OpLessThan extends Operator
{
    @Override
    public <T> T accept(IExpressionVisitor<T> visitor)
    {
        return visitor.visit(this);
    }
}
