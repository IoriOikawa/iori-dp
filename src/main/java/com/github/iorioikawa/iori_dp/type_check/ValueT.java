package com.github.iorioikawa.iori_dp.type_check;

public final class ValueT extends Type
{
    private static final ValueT instance = new ValueT();

    public static ValueT getInstance()
    {
       return instance;
    }
}
