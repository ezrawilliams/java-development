package com.pluralsight;

import java.util.ArrayList;

public class Hand {
    private ArrayList<Card> cards;

    public Hand()
    {
        cards = new ArrayList<>();
    }
    public void deal(Card card){
        cards.add(card);
    }

    public int getSize(){
        return cards.size();
    }

    public int getValue(){
        int value = 0;
        for(Card card : cards){
            card.flip();
            value+= card.getPointValue();
            /*
            I am saying if after adding and adding that value becomes >21
            and the value that allowed that was an Ace which has value 11
            minus 10 so that our Ace now has value 1
             */
           if (value > 21 && card.getPointValue()==11){
                System.out.println(value);
                System.out.println(card.getPointValue());
                value = value - 10;
            }
            card.flip();//hide the card again
        }
        //System.out.println(value);
        return value;
    }
}
