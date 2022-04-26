package com.example.lab9;



public class Multiplication extends Operator{
    @Override
    public Operand evaluate(Operand op1, Operand op2) {
        double mulvalue=0;
        mulvalue= op1.getValue() * op2.getValue();
         Operand awnser = new Operand(mulvalue);
        return awnser;
    }

    @Override
    public boolean isOpperand() {
        return false;
    }
}
