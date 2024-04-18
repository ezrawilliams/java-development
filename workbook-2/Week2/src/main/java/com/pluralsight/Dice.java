package com.pluralsight;

public class Dice {
    public static void main(String[] args) {
        Dice dice = new Dice();
        int roll1, roll2, twoCounter=0, fourCounter=0,sixCounter=0, sevenCounter=0, sum;

        for(int i=0; i<100; i++){
            roll1 = dice.roll();
            roll2 = dice.roll();
            sum=roll1+roll2;
            System.out.println("Roll "+(i+1)+":\t"+roll1+" - "+roll2+"\t Sum: "+sum);
            if (sum==2){
                twoCounter++;
            } else if (sum==4){
                fourCounter++;
            }else if (sum==6){
                sixCounter++;
            } else if (sum==7){
                sevenCounter++;
            }
        }//end of for loop
        System.out.println("Two counter: "+twoCounter);
        System.out.println("Four counter: "+fourCounter);
        System.out.println("Six counter: "+sixCounter);
        System.out.println("Seven counter: "+sevenCounter);
    }

    public int roll(){
        int randomNumber = (int)(Math.random()*6)+1;
        return randomNumber;
    }
}
