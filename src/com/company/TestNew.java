package com.company;

/**
 * Created by jonny1846 on 1/17/2017.
 */
public class TestNew {

    public static void main(String[] arg) {
       displayHighScorePosition("tom", 1500);
        displayHighScorePosition("bill", 900);
        displayHighScorePosition("jack", 400);
        displayHighScorePosition("jon", 40);




    }

    private static void displayHighScorePosition(String playerName, int score) {
        //String bill = playerName;
        System.out.println(playerName + " got on the high score table at place number " + calculateHighScorePosition(score));
    }

    private static int calculateHighScorePosition(int score) {

        if(score > 1000) return 1;
        if(score <1000 && score > 500) return 2;
        if(score < 500 && score > 100) return 3;
        return 4;

    }

}
