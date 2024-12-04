package ca.vanier;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ScoreManagerTest {

    @ParameterizedTest
    @ValueSource(ints = { 6, 7 })
    public void TestPassingScore(int score) {
        assertTrue(ScoreManager.checkTheScore(score));
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 5 })
    public void TestFaillingScore(int score) {
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
