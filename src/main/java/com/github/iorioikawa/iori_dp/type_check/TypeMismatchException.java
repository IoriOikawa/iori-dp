package com.github.iorioikawa.iori_dp.type_check;

import com.github.iorioikawa.iori_dp.parsing.Expression;

public class TypeMismatchException extends RuntimeException
{
    public TypeMismatchException(Expression e)
    {
        super(e.toString());
    }
}
