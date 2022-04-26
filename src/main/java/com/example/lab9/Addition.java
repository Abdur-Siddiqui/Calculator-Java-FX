package com.example.lab9;

public class Addition extends Operator{



    @Override
    public  Operand evaluate(Operand op1, Operand op2) {
  double sumop =0;
  sumop = op1.getValue() + op2.getValue();
   Operand opsum= new Operand(sumop);
   return opsum;
    }

    @Override
    public boolean isOpperand() {
        return false;
    }
}
