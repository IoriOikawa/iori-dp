package com.github.iorioikawa.iori_dp.tac;

public class Register extends Operand
{
    private final int name;

    public Register(int name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "R[" + name + "]";
    }
}
