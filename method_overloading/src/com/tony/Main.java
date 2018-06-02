package com.tony;

public class Main {

    public static void main(String[] args) {
	// write your code here
        calculateScore("katie",100);
        calculateScore(75);
        calculateScore();
    }


    public static int calculateScore(String playerName, int score) {
        System.out.println("Player" + playerName + "scored " +score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("unnamed player scored "  +score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("unnamed player scored no points");
        return 0;
    }

}
