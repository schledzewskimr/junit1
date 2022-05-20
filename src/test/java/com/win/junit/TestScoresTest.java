package test.java.com.win.junit;

import main.java.com.win.junit.TestScores;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestScoresTest {
    @DisplayName("Test processScore() method")
    @Test
    void testProcessScore() {
        int x = 33;
        int y = 95;
        int z = 101;

        assertEquals("You 'F'-ail", TestScores.processScore(x));
        assertEquals("Wow! 'A'-mazing!", TestScores.processScore(y));
        assertEquals("Hmmm.. That must be a mistake.", TestScores.processScore(z));
    }
}
