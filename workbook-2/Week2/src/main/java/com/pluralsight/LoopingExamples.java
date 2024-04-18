package com.pluralsight;
/*
This class will demo how we use loops in Java. What is a loop? It allows us to write code
using just a few lines but having the ability to do something over and over again:
 */

public class LoopingExamples {
    public static void main(String[] args) {
        //What if I wanted to print Welcome to Java 10 times? How would I do that?
      /*  System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Java");

        int count = 1;
        int sum = 0; //initialize to 0 because we need something to start with
        while (count <= 10) {//conditional statement - count<=10
           // System.out.println("Welcome to Java");
            sum += count; // sum = sum + count - accumulating sum
            count++; //increment - means increase by 1
        }
        System.out.println("The sum of numbers from 1 to 10 is " + sum);*/

        /*
        Find the sum of numbers from 50 to 100 using a while loop

        int loopCounter = 50;
        int sum = 0;
        while (loopCounter <= 100){ //every time the loop runs it is called an iteration.
            sum += loopCounter;
            loopCounter++;
           // System.out.println(sum);
        }
       // System.out.println(loopCounter);
        System.out.println(sum);*/

        /*
        Create a while loop that prints the numbers from 1000 to 10000

        int loop = 1000;
        int total = 0;
        while (loop <= 10000){
            total += loop;
            loop++;
            System.out.println(total);
            System.out.println(loop);

        }*/

        /*
        do...while loop - while loop checks the condition and then executes but the do..while
        loop executes and then checks the condition.


        int i=1;
        int sum=0;
        do{
            sum+=i;
            i++;
        } while (i<=10);
        System.out.println("The sum of the numbers from 1-10 is "+sum); */

        /*
        While we would if we want to check if something is true and then do something,
        do...while we would use if we want to do something and then check if something is true.
         */

        /*
        For loop has three parts - starting condition; the ending condition; increment
        It says for something...do something

        int sum=0;

        for (int i=1; i<=10; i++) {
            sum += i; //sum = sum+i
        }
        System.out.println(sum);

        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            if (i % 4 == 0) { //If i is divisible by 3 meaning no remainder when we divide it by 3
                break;//break out - leave; leap; jump out of the for loop
            }
            sum += i;//sum is 1 initially; then we add 2 so sum becomes 3
        }
        System.out.println("Sum = " + sum);*/

        /*
        continue is used when we want to skip something and continue the loop:

        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {//if the number is divisible by 3, skip it and continue
                continue;//skip 3, 6, 9
            }
            sum += i;
        }
        System.out.println("Sum = " + sum);
        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            if (i % 3 != 0) { // no need for continue
                sum += i;
            }
        }
        System.out.println("Sum = " + sum);*/
        /*
        Loops that loop in reverse:
        A loop that goes the other way


        //Print the numbers from 10 to 1:
        int num=10;

        while (num>0) { //while (num >=1)
            System.out.println(num);
            num--; // remove one from num
        }*/

        for (int i=10; i>0; i--){//i-- - decrement
            System.out.println(i);
        }
    }
}
