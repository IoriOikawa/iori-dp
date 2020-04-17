package com.github.iorioikawa.iori_dp.tac;

public class TacRead extends Tac
{
    @Override
    public <T> T accept(ITacVisitor<T> visitor)
    {
        return visitor.visit(this);
    }
}
