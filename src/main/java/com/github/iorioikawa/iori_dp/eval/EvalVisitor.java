package com.github.iorioikawa.iori_dp.eval;

import com.github.iorioikawa.iori_dp.parsing.*;

public class EvalVisitor implements IVisitor<Result>
{
    private final double x;

    public EvalVisitor(double x)
    {
        this.x = x;
    }

    @Override
    public Result visit(OpAdd v)
    {
        ValueR l = (ValueR) v.left.accept(this);
        ValueR r = (ValueR) v.right.accept(this);
        return new ValueR(l.value + r.value);
    }

    @Override
    public Result visit(OpSubtract v)
    {
        ValueR l = (ValueR) v.left.accept(this);
        ValueR r = (ValueR) v.right.accept(this);
        return new ValueR(l.value - r.value);
    }

    @Override
    public Result visit(OpMultiply v)
    {
        ValueR l = (ValueR) v.left.accept(this);
        ValueR r = (ValueR) v.right.accept(this);
        return new ValueR(l.value * r.value);
    }

    @Override
    public Result visit(OpDivide v)
    {
        ValueR l = (ValueR) v.left.accept(this);
        ValueR r = (ValueR) v.right.accept(this);
        return new ValueR(l.value / r.value);
    }

    @Override
    public Result visit(OpEqualsTo v)
    {
        ValueR l = (ValueR) v.left.accept(this);
        ValueR r = (ValueR) v.right.accept(this);
        return new PropR(l.value == r.value);
    }

    @Override
    public Result visit(OpGreaterThan v)
    {
        ValueR l = (ValueR) v.left.accept(this);
        ValueR r = (ValueR) v.right.accept(this);
        return new PropR(l.value > r.value);
    }

    @Override
    public Result visit(OpLessThan v)
    {
        ValueR l = (ValueR) v.left.accept(this);
        ValueR r = (ValueR) v.right.accept(this);
        return new PropR(l.value < r.value);
    }

    @Override
    public Result visit(OpAnd v)
    {
        PropR l = (PropR) v.left.accept(this);
        PropR r = (PropR) v.right.accept(this);
        return new PropR(l.value && r.value);
    }

    @Override
    public Result visit(OpOr v)
    {
        PropR l = (PropR) v.left.accept(this);
        PropR r = (PropR) v.right.accept(this);
        return new PropR(l.value || r.value);
    }

    @Override
    public Result visit(OpImply v)
    {
        PropR l = (PropR) v.left.accept(this);
        PropR r = (PropR) v.right.accept(this);
        return new PropR(!l.value || r.value);
    }

    @Override
    public Result visit(NumericConstant v)
    {
        return new ValueR(v.getValue());
    }

    @Override
    public Result visit(BooleanConstant v)
    {
        return new PropR(v.getValue());
    }

    @Override
    public Result visit(Variable v)
    {
        return new ValueR(x);
    }
}
