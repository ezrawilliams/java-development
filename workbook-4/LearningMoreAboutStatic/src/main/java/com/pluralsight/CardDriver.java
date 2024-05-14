package com.pluralsight;

import java.util.Scanner;

public class CardDriver {
    public static void main(String[] args) {
        /*Deck deck = new Deck();
        Hand hand = new Hand();

        //deal 5 cards:
        for(int i=0 ; i<5 ; i++){
            //get a card from the deck:
            Card card = deck.deal();
            //deal that card to the hand:
            hand.deal(card);
        }
        int handValue = hand.getValue();
        System.out.println("This hand is worth "+handValue);*/
        //Prompt for the name of each player:
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of the first player: ");
        String name1 = in.nextLine();
        System.out.print("Enter the name of the second player: ");
        String name2 = in.nextLine();
        //Create a deck:
        Deck deck = new Deck();
        //Shuffle the cards:
        deck.shuffle();
        //Create two hands:
        Hand hand1 = new Hand();
        Hand hand2 = new Hand();
        //Create the player objects:
        Player player1 = new Player(name1, hand1);
        Player player2 = new Player(name2, hand2);
        //Deal 2 cards to each hand
        for(int i=0 ; i<2 ; i++){
            //get a card from the deck:
            Card card = deck.deal();
            //deal that card to the hand:
            player1.getHand().deal(card);
        }
        for(int i=0 ; i<2 ; i++){
            //get a card from the deck:
            Card card = deck.deal();
            //deal that card to the hand:
            player2.getHand().deal(card);
        }
        //Display each players' hand:
        int handValue1 = player1.getHand().getValue();
        System.out.println(handValue1);
        int handValue2 = player2.getHand().getValue();
        System.out.println(handValue2);
      /*  int maxValue = 0;

        for (Player player : players) {
            // check if players total is close to 21 or 21
            int total = player.getTotal();
            if (total <= 21 && total > maxTotal) {
                maxTotal = total;
                // set the winner
                winner = player;
            }
        }*/

        /*
        While loop that keeps track of whether the user wants to hit or stay:
        If they hit we deal again, if stay then the if statements fire
         */

        if ((handValue1<=21) && (handValue1>handValue2)){
            System.out.println(player1.getPlayerName()+ " has won!");
        } else if  ((handValue2<=21) && (handValue2>handValue1)) {
            System.out.println(player2.getPlayerName() + " has won!");
        } else if ((handValue1>21) &&  (handValue2<21)){
            System.out.println(player2.getPlayerName()+ " has won!");
        } else if ((handValue2>21) &&  (handValue1<21)){
            System.out.println(player1.getPlayerName()+ " has won!");
        } else if ((handValue1 == handValue2)){
            System.out.println("Tie!");
        }
        else {
            System.out.println("Busted!");
        }

    }
}
