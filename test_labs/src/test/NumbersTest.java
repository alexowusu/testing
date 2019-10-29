package test;

import io.sub.testing.Numbers;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void sum() {
        int result = Numbers.sum(2, 3);
        assertEquals(5, result);
    }

    @Test
    void ifpositive() {
        boolean result = Numbers.ispositive(1);
        assertTrue(result);
    }

    @Test
    void ifnegetive() {
        boolean result = Numbers.isnegative(4);
        assertFalse(result);
    }


}