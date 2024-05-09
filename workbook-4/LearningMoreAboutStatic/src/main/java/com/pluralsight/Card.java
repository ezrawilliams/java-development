package com.pluralsight;

public class Card {
    private String suit;
    private String value;
    private boolean isFaceUp;

    public Card(String suit,
                String value) {
        this.suit=suit;
        this.value=value;
    }

    public String getSuit() {
        //we only return suit if the card is faceup:
        if(isFaceUp){
            return suit;
        } else
            return "#";
    }
    public String getValue(){
        // only return the value if the card is face up
        if(isFaceUp){
            // this is the string value of the card
            // i.e. A, K, Q, J, 10, 9 ...
            return value;
        }
        else { return "#"; }
    }
    public int getPointValue(){
        // only return the value if the card is face up
        int pointValue=0;
        if(isFaceUp){
            // determine point value and return it
            // A = 11
            // K, Q, J = 10
            // all numeric cards are equal to their face value
            if (value.equals("A")){
                pointValue=11;
            } else if (value.equals("K") || value.equals("Q")||
                    value.equals("J")){
                pointValue=10;
            } else {
                pointValue=Integer.parseInt(value);
            }
        }
        return pointValue;//return point value NOT ZERO
    }
    public boolean isFaceUp() {
        return isFaceUp;
    }

    public void flip(){
        isFaceUp=!isFaceUp;
    }
}
