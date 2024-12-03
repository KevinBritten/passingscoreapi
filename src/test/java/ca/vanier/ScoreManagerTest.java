package ca.vanier;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ScoreManagerTest {
    @Test
    public void TestPassingScore() {
        int score = 7;
        assertTrue(ScoreManager.checkTheScore(score));
    }

    @Test
    public void TestExactPassingScore() {
        int score = 6;
        assertTrue(ScoreManager.checkTheScore(score));
    }

    @Test
    public void TestFaillingScore() {
        int score = 5;
        assertFalse(ScoreManager.checkTheScore(score));
    }

    @Test
    public void TestNegativeScore() {
        int score = -5;
        assertThrows(IllegalArgumentException.class, () -> {
            ScoreManager.checkTheScore(score);
        });
    }
}
