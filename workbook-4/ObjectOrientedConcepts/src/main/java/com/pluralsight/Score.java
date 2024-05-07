package com.pluralsight;

/*
Class variables - private - playerName, playerScore, gameName, losses, wins, winOrLose
1. Should have a constructor that uses all the attributes: losses, wins, playerScore - should be 0,
winOrLose - false
2. Should include a method that increments wins every time the player wins
(winOrLose=true), and increments losses every time the player loses (winOrLose=false);
3. Also, the method should increase the score when the player wins and decrease the score
when the player loses
4. We also need a default constructor
5. Derived getter that prints - you beat high score if the user's score is over 1000
 */

public class Score {

    // attributes
    private String playerName;
    private int playerScore;
    private String gameName;
    private double losses;
    private double wins;
    private boolean winOrLose;

    public Score(String playerName, int playerScore, String gameName, double losses, double wins, boolean winOrLose) {
        this.playerName = playerName;
        this.playerScore = playerScore;
        this.gameName = gameName;
        this.losses = losses;
        this.wins = wins;
        this.winOrLose = winOrLose;
    }

    public Score(){
        this.playerName = "";
        this.playerScore = 0;
        this.gameName = "";
        this.wins = 0;
        this.winOrLose = false;
    }


    public void win(){
        wins++;
        winOrLose = true;
    }

    public void lose(){
        losses++;
        winOrLose = false;
    }

    public void updateScore(){
        if(winOrLose){
            playerScore++;
        } else {
            playerScore--;
        }
    }

    public void beatHighScore(){
        if(playerScore > 1000){
            System.out.println("You beat high score :)");
        }
    }

}
