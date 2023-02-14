package edu.uncc.jbryan76.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionalsTest {
    Conditionals instance = new Conditionals();

    @Test
    void numbersAreEqual() {
        assertTrue(instance.numbersAreEqual(1, 1));
        assertFalse(instance.numbersAreEqual(1, 2));
    }

    @Test
    void numberIsGreater() {
        assertTrue(instance.numberIsGreater(5, 1));
        assertFalse(instance.numberIsGreater(1, 5));
    }

    @Test
    void numberIsEqualOrLess() {
        assertTrue(instance.numberIsEqualOrLess(1, 1));
        assertTrue(instance.numberIsEqualOrLess(1, 2));
        assertFalse(instance.numberIsEqualOrLess(3, 2));
    }

    @Test
    void returnBiggerNumber() {
        assertEquals(5, instance.returnBiggerNumber(5, 1));
        assertEquals(10, instance.returnBiggerNumber(5, 10));
    }
}