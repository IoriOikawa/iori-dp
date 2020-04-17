package com.github.iorioikawa.iori_dp.tac;

public abstract class Tac
{
    Register dst;
    Register src1;
    Register src2;

    public Register getDst()
    {
        return dst;
    }

    public Register getSrc1()
    {
        return src1;
    }

    public Register getSrc2()
    {
        return src2;
    }

    public abstract <T> T accept(ITacVisitor<T> visitor);
}
