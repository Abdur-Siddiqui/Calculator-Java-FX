package com.example.lab9;

public interface Token {

    public default boolean isOperand() {
        return false;
    }

    boolean isOpperand();
}
