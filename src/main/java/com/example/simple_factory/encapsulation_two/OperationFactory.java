package com.example.simple_factory.encapsulation_two;

public class OperationFactory {
    public static Operation createOperation(String operate){
        Operation operation = null;
        switch (operate){
            case "+":
                operation =new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDivision();
                break;
        }
        return operation;

    }
}
