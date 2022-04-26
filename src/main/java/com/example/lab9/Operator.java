package com.example.lab9;

public abstract class Operator implements Token {

    // overiding the isoperand method
    @Override
    public boolean isOperand() {
        return false;
    }

    public abstract Operand evaluate(Operand op1, Operand op2);

}
