package test.java.com.win.junit;
import main.java.com.win.junit.NumberComparison;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberComparisonTest {

    @DisplayName("Test compare() method")
    @Test
    void testCompare() {
        assertEquals("The numbers are the same", NumberComparison.compare(10,10));
        System.out.println("tested numbers are the same");
        assertEquals("The first number is less than the second number", NumberComparison.compare(10,11));
        System.out.println("tested first number < second number");
        assertEquals("The first number is greater than the second number", NumberComparison.compare(11,10));
        System.out.println("tested first number > second number");
    }

}