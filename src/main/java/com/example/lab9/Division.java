package com.example.lab9;

public class Division extends Operator{
    @Override
    public Operand evaluate(Operand op1, Operand op2) {
        double divResult =0;
        divResult = op1.getValue() / op2.getValue();
        Operand divAwnser = new Operand(divResult);
        return divAwnser;

    }

    @Override
    public boolean isOpperand() {
        return false;
    }
}
