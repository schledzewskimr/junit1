package test.java.com.win.junit;
import main.java.com.win.junit.Box;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class BoxTest {
    Box testBox = new Box(3,5);
    Box secondTestBox = new Box(testBox);
    Box thirdTestBox = new Box(2,6);
    Box fourthTestBox = new Box(thirdTestBox);

    @DisplayName("Test isEqual() method")
    @Test
    void testIsEqual() {
        assertEquals(true, testBox.isEqual(secondTestBox));
        assertEquals(false, testBox.isEqual(thirdTestBox));
        assertEquals(true,thirdTestBox.isEqual(fourthTestBox));
    }
    @DisplayName("Test duplicate() method by invoking the isEqual() method")
    @Test
    void testDuplicate(){
        Box fifthTestBox = fourthTestBox.duplicate();
        assertEquals(true, fifthTestBox.isEqual(fourthTestBox));
    }
    @DisplayName("Test isTwoObjectsEqual(Box b1, Box b2) method")
    @Test
    void testIsTwoObjectsEqual(){
        assertEquals(true, Box.isTwoObjectsEqual(testBox,secondTestBox));
        assertEquals(false, Box.isTwoObjectsEqual(testBox,thirdTestBox));
    }
    @DisplayName("test display() method")
    @Test
    void testDisplay(){
        assertEquals("width is 3 and height is 5", testBox.display());
    }

}
