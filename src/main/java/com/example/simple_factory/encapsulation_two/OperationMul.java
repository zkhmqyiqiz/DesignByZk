package com.example.simple_factory.encapsulation_two;

public class OperationMul extends Operation {
    @Override
    public Double getResult(Double numberA, Double numberB) {
        Double result  = numberA * numberB;
        return result;
    }
}
