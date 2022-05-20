package test.java.com.win.junit;
import main.java.com.win.junit.Calculations;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculationsTest {
    int x = 1;
    int y = 2;
    @DisplayName("Test addition method")
    @Test

    void testAddition() {
        assertEquals(3, Calculations.addition(x,y));
    }
    @DisplayName("Test subtraction method")
    @Test

    void testSubtraction() {
        assertEquals(-1, Calculations.subtraction(x,y));
    }
    @DisplayName("Test multiplication method")
    @Test

    void testMultiplication() {
        assertEquals(2, Calculations.multiplication(x,y));
    }
    @DisplayName("Test division method")
    @Test

    void testDivision() {
        assertEquals(.5, Calculations.division(x,y));
    }
    @DisplayName("Test modulo method")
    @Test

    void testModulo() {
        assertEquals(1, Calculations.modulo(x,y));
    }

}
