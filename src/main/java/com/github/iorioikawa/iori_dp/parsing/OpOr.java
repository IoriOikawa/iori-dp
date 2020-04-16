package com.github.iorioikawa.iori_dp.parsing;

public class OpOr extends Operator
{
    @Override
    public <T> T accept(IVisitor<T> visitor)
    {
        return visitor.visit(this);
    }
}
