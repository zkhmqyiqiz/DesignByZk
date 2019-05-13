package com.example.simple_factory.encapsulation_two;

public class Operation {
    public Double numberA;
    public Double numberB;

    public Double getNumberA() {
        return numberA;
    }

    public void setNumberA(Double numberA) {
        this.numberA = numberA;
    }

    public Double getNumberB() {
        return numberB;
    }

    public void setNumberB(Double numberB) {
        this.numberB = numberB;
    }

    public  Double getResult(){
        Double result  = 0d ;
        result = numberA - numberB;
        return  result;
    }
}
