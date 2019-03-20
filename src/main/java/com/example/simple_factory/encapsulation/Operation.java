package com.example.simple_factory.encapsulation;

/**
 * 业务的封装，将业务逻辑与界面逻辑分开
 * 业务逻辑*/
public class Operation {
    public static double getResult(double Numbera,double Numberb,String operate){
        double result = 0d;
        switch (operate){
            case "+":
                result = Numbera + Numberb;
                break;
            case "-":
                result = Numbera - Numberb;
                break;
            case "*":
                result = Numbera * Numberb;
                break;
            case "/":
                result = Numbera / Numberb;
                break;
        }
        return  result;

    }
}
