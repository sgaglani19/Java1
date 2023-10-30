package com.xpanxion.assignments.student;

import java.util.ArrayList;

public class Calculator {
    private int num1;
    private int num2;
    private String op;
    private int result;
    private static ArrayList<String> history = new ArrayList<>();

    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2; 
    }
    public int add(){
        result = num1 + num2;
        history.add("" + num1 + " + " + num2 + " = " + result);
        return result;
    }

    public int sub(){
        result = num1 - num2;
        history.add("" + num1 + " - " + num2 + " = " + result);

        return result;
    }

    public int mul(){
        result = num1 * num2;
        history.add("" + num1 + " * " + num2 + " = " + result);

        return result;
    }

    public int div(){
        result = 0;
        
        if(num2 != 0){
            result = num1 / num2;
            history.add("" + num1 + " / " + num2 + " = " + result);
        }
        return result;
    }
    public String getOp(){
        return op;
    }
    public int getNum1(){
        return num1;
    }
    public int getNum2(){
        return num2;
    }
    public int getResult(){
        return result;
    }
    public static ArrayList<String> getHistory(){
        return history;
    }
}

