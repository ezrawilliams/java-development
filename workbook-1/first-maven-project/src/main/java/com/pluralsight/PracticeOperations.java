package com.pluralsight;

public class PracticeOperations {
    public static void main(String[] args) {

       /* String word1 = "Hi ";
        String word2 = "there! ";
        String word3 ="Bye";
        String completeWord = word1 + word2 + word3;
        System.out.println(completeWord);

        // doubles practice
        double firstValue = 5.3748328468273;
        double secondValue = 3.00;
        double thirdValue = 2.0;


        //Now we need another double that will hold the calculation of the results:
        double result = firstValue + secondValue + thirdValue;
        System.out.println(result);
        //Subtraction:
        result = firstValue - secondValue - thirdValue;
        System.out.println(result);
        //Multiplication:
        result = firstValue * secondValue * thirdValue;
        System.out.println(result);
        //Division:
        result = firstValue / secondValue / thirdValue;
        double accumulation = result + 10;
        System.out.println(accumulation);
        accumulation = accumulation + 100; //accumulation means adding to what is already there.
        System.out.println(accumulation);
        accumulation = accumulation + 1000;
        System.out.println(accumulation);*/

        int x1 = 5, x2=85, y1=10, y2=50;
        double distance;
        int xm = x2-x1;
        int ym = y2-y1;

        distance = Math.sqrt(Math.pow(xm, 2) + Math.pow(ym, 2));
        System.out.println(distance);


    }







}
