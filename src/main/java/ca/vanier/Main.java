package ca.vanier;

public class Main {
    public static void main(String[] args) {

        int score = Integer.parseInt(args[0]);
        System.out.println(ScoreManager.checkTheScore(score));
    }
}