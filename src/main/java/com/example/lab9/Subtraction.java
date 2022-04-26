package com.example.lab9;

public class Subtraction extends Operator{
    @Override
    public Operand evaluate(Operand op1, Operand op2) {
        double result =0;
        result = op1.getValue() - op2.getValue();
        Operand opnew = new Operand(result);
        return opnew;
    }

    @Override
    public boolean isOpperand() {
        return false;
    }
}
