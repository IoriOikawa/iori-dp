package com.github.iorioikawa.iori_dp.parsing;

public interface IVisitor<T>
{
    T visit(OpAdd v);

    T visit(OpSubtract v);

    T visit(OpMultiply v);

    T visit(OpDivide v);

    T visit(OpEqualsTo v);

    T visit(OpGreaterThan v);

    T visit(OpLessThan v);

    T visit(OpAnd v);

    T visit(OpOr v);

    T visit(OpImply v);

    T visit(NumericConstant v);

    T visit(BooleanConstant v);

    T visit(Variable v);
}
