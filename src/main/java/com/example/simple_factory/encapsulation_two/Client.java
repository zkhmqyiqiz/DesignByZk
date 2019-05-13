package com.example.simple_factory.encapsulation_two;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;

public class Client {
    public static void main(String[] args) {
        Console console =System.console();
        try{
            System.out.println("请输入数字A：");
            //将键盘中输入的值写入缓存区
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //读取缓存区的内容
            String strNumberA = br.readLine();
            System.out.println("请输入运算符号（+、-、*、/）：");
            String strOperate = br.readLine();
            Operation operation = OperationFactory.createOperation(strOperate);
            operation.setNumberA(Double.parseDouble(strNumberA));
            System.out.println("请输入数字B：");
            String strNumberB = br.readLine();
            operation.setNumberB(Double.parseDouble(strNumberB));
            Double strResult = operation.getResult();
           // String strResult =Double.toString(Operation.getResult(Double.parseDouble(strNumberA),Double.parseDouble(strNumberB),strOperate));
            //当B为0，且运算符号为/ 的时候，结果没有报错，反而为无穷大
            System.out.println(strResult);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("你输入的信息有误："+e.getMessage());
        }
    }
}
