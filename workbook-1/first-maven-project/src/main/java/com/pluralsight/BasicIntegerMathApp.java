package com.pluralsight;

public class BasicIntegerMathApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        int result;
       calc(a,b,'+');
        calc(a,b,'-');
        calc(a,b,'*');
        calc(a,b,'/');
    }

    public static void calc(int num1, int num2, char calculation){
        int result=0;
        if (calculation == '+') {
            result= num1+num2;
        } else if (calculation == '-') {
            result= num1-num2;
        } else if (calculation == '*') {
            result= num1*num2;
        } else if (calculation == '/') {
            result= num1/num2;
        }
        System.out.println(result);
    }
}
