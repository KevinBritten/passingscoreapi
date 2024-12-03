package ca.vanier;

public class ScoreManager {
    private int scores;
    private Boolean result;

    public int getScores() {
        return scores;
    }
    public void setScores(int scores) {
        this.scores = scores;
    }
    public Boolean getResult() {
        return result;
    }
    public void setResult(Boolean result) {
        this.result = result;
    }

    public ScoreManager() {
    } 

    static boolean checkTheScore( int scores){
        boolean result = false; 
        if (scores < 0) {
            throw new IllegalArgumentException("Score cannot be negative.");
        }

        if (scores >= 6) {
            result = true; 
        }
    
        return result; 

    }

    
}
