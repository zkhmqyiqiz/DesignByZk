package com.example.simple_factory.encapsulation_two;

public class OperationAdd extends  Operation {
    @Override
    public  Double getResult(Double numberA, Double numberB){
        Double result  = 1d ;
        result = numberA - numberB;
        return  result;
    }
}