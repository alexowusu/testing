package io.sub.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void sum() {
        int results = Numbers.sum(4,5);
        assertEquals(results, 8);
    }

    @Test
    void testToString() {
    }

    @Test
    void isPositive() {
        boolean results = Numbers.isPositive(9);
        assertEquals(results, 9);
    }

    @Test
    void isNegative() {
        boolean results = Numbers.isNegative(-8);
        assertEquals(results, -10);
    }
}