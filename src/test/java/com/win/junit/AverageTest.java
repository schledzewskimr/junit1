package test.java.com.win.junit;
import main.java.com.win.junit.Average;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class AverageTest {

    int x = 1;
    int y = 2;
    int z = 3;
    @DisplayName("Test sum() method")
    @Test
    void testSum() {
        assertEquals(6, Average.sum(x,y,z));
    }
    @DisplayName("Test average() method")
    @Test
    void testAverage(){
        assertEquals(2,Average.average(x,y,z));
    }
}