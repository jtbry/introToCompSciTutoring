package edu.uncc.jbryan76.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LoopsTest {
    Loops instance = new Loops();

    @Test
    void sumNumbersFor() {
        assertEquals(0, instance.sumNumbersFor(0));
        assertEquals(0, instance.sumNumbersFor(1));
        assertEquals(15, instance.sumNumbersFor(5));
    }

    @Test
    void sumNumbersWhile() {
        assertEquals(0, instance.sumNumbersWhile(0));
        assertEquals(0, instance.sumNumbersWhile(1));
        assertEquals(15, instance.sumNumbersWhile(5));
    }

    @Test
    void findMax() {
        int[] array = new int[] { 1, 5, 3, 23 };
        assertEquals(23, instance.findMax(array));
    }
}