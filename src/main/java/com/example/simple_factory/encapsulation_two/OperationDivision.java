package com.example.simple_factory.encapsulation_two;

public class OperationDivision extends Operation {
    @Override
    public Double getResult(Double numberA, Double numberB) {
        Double result = 0d;
        try {
            result = numberA /numberB;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getClass()+"出错");
        }
        return result;
    }

    public static void main(String[] args) {
        OperationDivision  operationDivision = new OperationDivision();
        operationDivision.getResult(12.0,0.0);
    }
}
