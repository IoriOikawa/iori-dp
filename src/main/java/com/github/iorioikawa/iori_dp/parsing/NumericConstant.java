package com.github.iorioikawa.iori_dp.parsing;

public class NumericConstant extends Constant
{
    private final double value;

    public NumericConstant(double v)
    {
        this.value = v;
    }

    public double getValue()
    {
        return this.value;
    }

    @Override
    public <T> T accept(IExpressionVisitor<T> visitor)
    {
        return visitor.visit(this);
    }
}
