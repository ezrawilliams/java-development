package com.pluralsight;

public class BasicFloatingPointMathApp {
    public static void main(String[] args){
        /*float a = 10;
        float b = 3;
        float result;
        result = a + b;
        System.out.println(result); // displays 13.0
        result = a - b;
        System.out.println(result); // displays 7.0
        result = a * b;
        System.out.println(result); // displays 30.0
        result = a / b;
        System.out.println(result); // displays 3.3333333
        result = a % b;
        System.out.println(result); // displays 1.0
        result = b - (a % b);
        System.out.println(result); // displays 2.0
        int x = 5;
        int y;
        x++; // adds 1 to x (now it is 6)
        System.out.println(x);
        ++x; // adds 1 to x (now it is 7)
        System.out.println(x);
        y = ++x; // adds 1 to x and then assigns x to y
        // x is now 8 and y is 8
        System.out.println(y);
        x = 5;
        y = x++; // assigns x to y and then adds 1 to x
        // x is now 6 and y is 5
        System.out.println(y);

        long ssn = 111_22_3333L;
        long creditCard = 5200_7500_6500_0001L;
        double loanBalance = 1_225_570.00;

        long ex1 = ssn+creditCard;
        System.out.println(ex1);
        int count = 11;
        double unitPrice = 7.12;
        double taxRate = 0.825;
        double totalCost;
        totalCost = (count * unitPrice) * (1 + taxRate);
        System.out.println(totalCost);

        int natKidCount = 2, brittKidCount = 4;
        int mostKids = Math.max(natKidCount, brittKidCount);
        System.out.println(
                "The biggest family has " + mostKids + " kids");*/

        int answer = 0;
        answer += 10; // answer = answer + 10 //accumulator
        answer -= 5; // 5 answer = answer - 5
        answer *= 10; // 50 answer = answer *10
        answer /= 2; // 25 answer = answer / 2
        answer %= 10; // 5 (int remainder of 25 / 10) answer = answer % 10
    }
}
