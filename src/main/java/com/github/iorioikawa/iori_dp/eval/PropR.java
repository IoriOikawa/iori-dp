package com.github.iorioikawa.iori_dp.eval;

public class PropR extends Result
{
    public final boolean value;

    public PropR(boolean v)
    {
        this.value = v;
    }

    @Override
    public String toString()
    {
        return String.valueOf(this.value);
    }
}
