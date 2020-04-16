package com.github.iorioikawa.iori_dp;

import com.github.iorioikawa.iori_dp.eval.EvalVisitor;
import com.github.iorioikawa.iori_dp.eval.Result;
import com.github.iorioikawa.iori_dp.parsing.Expression;
import com.github.iorioikawa.iori_dp.parsing.Operator;
import com.github.iorioikawa.iori_dp.parsing.OperatorFactory;
import com.github.iorioikawa.iori_dp.parsing.ValueFactory;
import com.github.iorioikawa.iori_dp.type_check.PropT;
import com.github.iorioikawa.iori_dp.type_check.Type;
import com.github.iorioikawa.iori_dp.type_check.TypeCheckVisitor;
import com.github.iorioikawa.iori_dp.type_check.ValueT;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Operator op = OperatorFactory.create("+");
        op.left = ValueFactory.create("x");
        op.right = ValueFactory.create("1");
        Operator op2 = OperatorFactory.create(">");
        op2.left = op;
        op2.right = ValueFactory.create("5");
        Operator op3 = OperatorFactory.create("->");
        op3.left = ValueFactory.create("false");
        op3.right = ValueFactory.create("true");
        Operator op4 = OperatorFactory.create("/\\");
        op4.left = op2;
        op4.right = op3;

        Expression e = op4;

        TypeCheckVisitor typeChecker = new TypeCheckVisitor();
        Type t = e.accept(typeChecker);
        if (t == ValueT.getInstance())
            System.out.println("It's a value!");
        else if (t == PropT.getInstance())
            System.out.println("It's a prop!");
        else
            System.out.println("WTF?");

        Scanner keyboard = new Scanner(System.in);
        while (true){
            double v = keyboard.nextDouble();
            EvalVisitor evalVisitor = new EvalVisitor(v);
            Result r = e.accept(evalVisitor);
            System.out.println(r);
        }
    }
}
