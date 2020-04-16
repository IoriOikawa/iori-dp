package com.github.iorioikawa.iori_dp.parsing;

public class BooleanConstant extends Constant
{
    private final boolean value;

    public BooleanConstant(boolean v)
    {
        this.value = v;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor)
    {
        return visitor.visit(this);
    }
}
