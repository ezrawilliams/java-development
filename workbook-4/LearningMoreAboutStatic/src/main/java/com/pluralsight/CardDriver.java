package com.pluralsight;

public class CardDriver {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Hand hand = new Hand();

        //deal 5 cards:
        for(int i=0 ; i<5 ; i++){
            //get a card from the deck:
            Card card = deck.deal();
            //deal that card to the hand:
            hand.deal(card);
        }
        int handValue = hand.getValue();
        System.out.println("This hand is worth "+handValue);
    }
}
