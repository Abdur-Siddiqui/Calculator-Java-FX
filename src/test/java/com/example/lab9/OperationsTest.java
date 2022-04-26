package com.example.lab9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperationsTest {
    @Test
    // wrtiing test case for addition
    public void
    AdditionEvaluate_TwoPositiveOperands_AddTheNumbers(){
        Operand op1 = new Operand(2);
        Operand op2 = new Operand(3);
        Addition addition = new Addition();
        Operand result = addition.evaluate(op1, op2);
        assertEquals(result.getValue(),5);
    }
     @Test
    public void
    Addition_TwoPositiveOperands_AddTheNumbers(){
        Operand op1 = new Operand(5);
        Operand op2 = new Operand(7);
        Addition addition2 = new Addition();
        Operand result = addition2.evaluate(op1, op2);
        assertEquals(result.getValue(),12);
    }


    @Test
    public void
    Addition_TwoNegativeOperands_AddTheNumbers(){
        Operand op1 = new Operand(-3);
        Operand op2 = new Operand(1);
        Addition addition3 = new Addition();
        Operand result = addition3.evaluate(op1, op2);
        assertEquals(result.getValue(),-2);
    }


    @Test
      // writting test case for subtraction
      public void
    SubtractionEvaluate_TwoPositiveOperands_SUubTheNumbers(){
        Operand op1 = new Operand(3);
        Operand op2 = new Operand(2);
        Subtraction subtraction = new Subtraction();
        Operand result = subtraction.evaluate(op1, op2);
        assertEquals(result.getValue(),1);
    }
    @Test
    // writting test case for subtraction
    public void
    Subtraction_TwoPositiveOperands_SUubTheNumbers(){
        Operand op1 = new Operand(2);
        Operand op2 = new Operand(2);
        Subtraction subtraction2 = new Subtraction();
        Operand result = subtraction2.evaluate(op1, op2);
        assertEquals(result.getValue(),0);
    }
    @Test
    // writting test case for subtraction
    public void
    SubtractionEvaluate_TwoNegtaiveOperands_SUubTheNumbers(){
        Operand op1 = new Operand(-3);
        Operand op2 = new Operand(-2);
        Subtraction subtraction3 = new Subtraction();
        Operand result = subtraction3.evaluate(op1, op2);
        assertEquals(result.getValue(),-1);
    }


        @Test
        // writting test case for multiplication
    public void
    MultiplicationEvaluate_TwoPositiveOperands_MultiplyTheNumbers(){
        Operand op1 = new Operand(3);
        Operand op2 = new Operand(2);
        Multiplication multiplication = new Multiplication();
        Operand result = multiplication.evaluate(op1, op2);
        assertEquals(result.getValue(),6);
    }
   @Test
    public void
    MultiplicationPositiveOperands_MultiplyTheNumbers(){
        Operand op1 = new Operand(6);
        Operand op2 = new Operand(6);
        Multiplication multiplication2= new Multiplication();
        Operand result = multiplication2.evaluate(op1, op2);
        assertEquals(result.getValue(),36);
    }
@Test
    public void
    MultiplicationEvaluate_TwoNegativeOperands_MultiplyTheNumbers(){
        Operand op1 = new Operand(-8);
        Operand op2 = new Operand(-9);
        Multiplication multiplication3 = new Multiplication();
        Operand result = multiplication3.evaluate(op1, op2);
        assertEquals(result.getValue(),72);
    }


    @Test
    public void
    DivisionEvaluate_TwoPositiveOperands_DivideTheNumbers(){
        Operand op1 = new Operand(3);
        Operand op2 = new Operand(2);
        Division division  = new Division();
        Operand result = division.evaluate(op1, op2);
        assertEquals(result.getValue(),1.5);
    }
    @Test
    public void
    DivisionEvaluate_PositiveOperands_DivideTheNumbers(){
        Operand op1 = new Operand(5);
        Operand op2 = new Operand(5);
        Division division2  = new Division();
        Operand result = division2.evaluate(op1, op2);
        assertEquals(result.getValue(),1);
    }
    @Test
    public void
    DivisionEvaluate_NegativeOperand_DivideTheNumbers(){
        Operand op1 = new Operand(-1);
        Operand op2 = new Operand(2);
        Division division  = new Division();
        Operand result = division.evaluate(op1, op2);
        assertEquals(result.getValue(),-0.5);
    }
}
