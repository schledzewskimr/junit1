package test.java.com.win.junit;
import main.java.com.win.junit.SameOrNah;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SameOrNahTest {
    @DisplayName("Test wordCheck() method")
    @Test
    void testWordCheck() {
        String x = "yes";
        String y = "no";
        String z = "yes";

        assertEquals("The words are different! Incredible!", SameOrNah.wordCheck(x,y));
        assertEquals("The words are the same! Unbelievable!", SameOrNah.wordCheck(x,z));
    }
}
