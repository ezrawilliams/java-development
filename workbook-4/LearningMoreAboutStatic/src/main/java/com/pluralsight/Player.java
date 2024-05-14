package com.pluralsight;

public class Player {
    private String playerName;
    private Hand hand;

    public Player(String playerName, Hand hand) {
        this.playerName = playerName;
        this.hand = hand;
    }

    public String getPlayerName() {
        return playerName;
    }

    public Hand getHand() {
        return hand;
    }
}
