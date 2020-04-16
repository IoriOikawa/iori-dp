package com.github.iorioikawa.iori_dp.type_check;

import com.github.iorioikawa.iori_dp.parsing.*;

public class TypeCheckVisitor implements IVisitor<Type>
{
    @Override
    public Type visit(OpAdd v)
    {
        Type l = v.left.accept(this);
        Type r = v.right.accept(this);
        if (l == ValueT.getInstance() && r == ValueT.getInstance())
            return ValueT.getInstance();

        throw new TypeMismatchException(v);
    }

    @Override
    public Type visit(OpSubtract v)
    {
        Type l = v.left.accept(this);
        Type r = v.right.accept(this);
        if (l == ValueT.getInstance() && r == ValueT.getInstance())
            return ValueT.getInstance();

        throw new TypeMismatchException(v);
    }

    @Override
    public Type visit(OpMultiply v)
    {
        Type l = v.left.accept(this);
        Type r = v.right.accept(this);
        if (l == ValueT.getInstance() && r == ValueT.getInstance())
            return ValueT.getInstance();

        throw new TypeMismatchException(v);
    }

    @Override
    public Type visit(OpDivide v)
    {
        Type l = v.left.accept(this);
        Type r = v.right.accept(this);
        if (l == ValueT.getInstance() && r == ValueT.getInstance())
            return ValueT.getInstance();

        throw new TypeMismatchException(v);
    }

    @Override
    public Type visit(OpEqualsTo v)
    {
        Type l = v.left.accept(this);
        Type r = v.right.accept(this);
        if (l == ValueT.getInstance() && r == ValueT.getInstance())
            return PropT.getInstance();

        throw new TypeMismatchException(v);
    }

    @Override
    public Type visit(OpGreaterThan v)
    {
        Type l = v.left.accept(this);
        Type r = v.right.accept(this);
        if (l == ValueT.getInstance() && r == ValueT.getInstance())
            return PropT.getInstance();

        throw new TypeMismatchException(v);
    }

    @Override
    public Type visit(OpLessThan v)
    {
        Type l = v.left.accept(this);
        Type r = v.right.accept(this);
        if (l == ValueT.getInstance() && r == ValueT.getInstance())
            return PropT.getInstance();

        throw new TypeMismatchException(v);
    }

    @Override
    public Type visit(OpAnd v)
    {
        Type l = v.left.accept(this);
        Type r = v.right.accept(this);
        if (l == PropT.getInstance() && r == PropT.getInstance())
            return PropT.getInstance();

        throw new TypeMismatchException(v);
    }

    @Override
    public Type visit(OpOr v)
    {
        Type l = v.left.accept(this);
        Type r = v.right.accept(this);
        if (l == PropT.getInstance() && r == PropT.getInstance())
            return PropT.getInstance();

        throw new TypeMismatchException(v);
    }

    @Override
    public Type visit(OpImply v)
    {
        Type l = v.left.accept(this);
        Type r = v.right.accept(this);
        if (l == PropT.getInstance() && r == PropT.getInstance())
            return PropT.getInstance();

        throw new TypeMismatchException(v);
    }

    @Override
    public Type visit(NumericConstant v)
    {
        return ValueT.getInstance();
    }

    @Override
    public Type visit(BooleanConstant v)
    {
        return PropT.getInstance();
    }

    @Override
    public Type visit(Variable v)
    {
        return ValueT.getInstance();
    }
}
