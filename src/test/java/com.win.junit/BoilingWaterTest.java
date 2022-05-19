package com.win.junit;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoilingWaterTest {

    @DisplayName("Test isBoiling() method")
    @Test
    void testIsBoiling() {
        assertEquals("Water is boiling!", BoilingWater.isBoiling(213));
        assertEquals("It's starting to boil!", BoilingWater.isBoiling(212));
        assertEquals("Water is not boiling :(", BoilingWater.isBoiling(211));
    }

}