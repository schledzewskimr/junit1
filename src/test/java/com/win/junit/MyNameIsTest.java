package test.java.com.win.junit;
import main.java.com.win.junit.MyNameIs;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyNameIsTest {

    @DisplayName("Test firstLine()method")
    @Test
    void testFirstLine() {
        assertEquals("My name is", MyNameIs.firstLine("My name is"));
    }

    @DisplayName("Test secondLine() method")
    @Test
    void testSecondLine(){
        assertEquals("Mark", MyNameIs.secondLine("Mark"));
    }

    @DisplayName("Test thirdLine() method")
    @Test
    void testThirdLine(){
        assertEquals("Schledzewski", MyNameIs.secondLine("Schledzewski"));
    }

}
