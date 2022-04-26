package com.example.lab9;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class PostfixEvaluator {

    private ArrayList<Token> expression = new ArrayList<>();

    private double evaluate() {
        double result = 0;
        return result;
    }

    public void addToken(Token t) {
        expression.add(t);

    }

    ArrayDeque<Operand> operands = new ArrayDeque<>();

    for (Token t :expression){
        if(t.isOperand()){
             operands.push((Operand) t);
        }

    }







}
