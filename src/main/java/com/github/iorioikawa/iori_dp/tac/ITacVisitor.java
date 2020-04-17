package com.github.iorioikawa.iori_dp.tac;

public interface ITacVisitor<T>
{
    T visit(TacAdd v);

    T visit(TacSubtract v);

    T visit(TacMultiply v);

    T visit(TacDivide v);

    T visit(TacEqualsTo v);

    T visit(TacGreaterThan v);

    T visit(TacLessThan v);

    T visit(TacAnd v);

    T visit(TacOr v);

    T visit(TacImply v);

    T visit(TacRead v);

    T visit(TacWrite v);
}
