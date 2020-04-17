package com.github.iorioikawa.iori_dp.tac;

public class TacAnd extends Tac
{
    @Override
    public <T> T accept(ITacVisitor<T> visitor)
    {
        return visitor.visit(this);
    }
}
