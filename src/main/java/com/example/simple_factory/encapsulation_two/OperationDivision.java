package com.example.simple_factory.encapsulation_two;

public class OperationDivision extends Operation {
    @Override
    public Double getResult() {
        Double result = 0d;
        try {
            result = numberA /numberB;
        }catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getClass()+"出错");
        }
        return result;
    }

}
