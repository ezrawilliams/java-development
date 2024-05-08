package com.pluralsight;

public class ScoreDriver {
    public static void main(String[] args) {
        //Create a score object
        Score score = new Score();
        //loop and allow the user to win 1000 times
        for(int i = 0; i < 1000; i++){
            score.win();
            score.updateScore();
        }
        //print wins, losses, score, run beatHighScore method
        System.out.println("Wins: " + score.getWins());
        System.out.println("Losses: " + score.getLosses());
        System.out.println("Score: " + score.getPlayerScore());
        // print you beat high score if over 1000
        score.beatHighScore();
    }
}
