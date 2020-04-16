package com.github.iorioikawa.iori_dp.eval;

public class ValueR extends Result
{
    public final double value;

    public ValueR(double v)
    {
        this.value = v;
    }

    @Override
    public String toString()
    {
        return String.valueOf(this.value);
    }
}
