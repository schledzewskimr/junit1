package test.java.com.win.junit;
import main.java.com.win.junit.MyNameIs;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyNameIsTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("~~~Before all test methods");
    }
    @BeforeEach
    void beforeEach() {
        System.out.println("--Before each test method");
    }
    @AfterEach
    void afterEach() {
        System.out.println("-After each test method");
    }
    @AfterAll
    static void afterAll() {
        System.out.println("~~~~~~~~~~After all test methods");
    }
    @DisplayName("Test firstLine()method")
    @Test
    void testFirstLine() {
        assertEquals("My name is", MyNameIs.firstLine("My name is"));
        System.out.println("first line checks out");
    }
    @DisplayName("Test secondLine() method")
    @Test
    void testSecondLine(){
        assertEquals("Mark", MyNameIs.secondLine("Mark"));
        System.out.println("second line checks out");
    }
    @DisplayName("Test thirdLine() method")
    @Test
    void testThirdLine(){
        assertEquals("Schledzewski", MyNameIs.secondLine("Schledzewski"));
        System.out.println("third line checks out");
    }

}
