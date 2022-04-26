package com.example.lab9;

public final class Operand implements Token{
     //  creating a double value
    private double Value;


    @Override
    public boolean isOpperand() {
        return true;
    }

    // creating a constructor
    public Operand(double OpVal){
        this.Value=OpVal;
    }

    public double getValue(){
        return Value;
    }


}
