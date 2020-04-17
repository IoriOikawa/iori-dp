package com.github.iorioikawa.iori_dp.tac;

public class RegisterFactory
{
    private int numCreated = 0;

    public Register create()
    {
        return new Register(numCreated++);
    }
}
