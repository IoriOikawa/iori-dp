package com.github.iorioikawa.iori_dp.parsing;

public class NumericConstant extends Constant
{
    private final double value;

    public NumericConstant(double v)
    {
        this.value = v;
    }

    @Override
    public <T> T accept(IVisitor<T> visitor)
    {
        return visitor.visit(this);
    }
}
