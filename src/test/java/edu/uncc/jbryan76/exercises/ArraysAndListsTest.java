package edu.uncc.jbryan76.exercises;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ArraysAndListsTest {
    ArraysAndLists instance = new ArraysAndLists();

    @Test
    void createArray() {
        int[] expected = new int[] { 1, 2, 3, 4, 5 };
        assertArrayEquals(expected, instance.createArray());
    }

    @Test
    void createList() {
        ArrayList<Integer> expected = new ArrayList<>();
        expected.addAll(List.of(10, 20, 30, 40, 50));
        assertTrue(expected.equals(instance.createList()));
    }

    @Test
    void addValues() {
        int[] array = new int[] { 1, 2, 3, 4, 5 };
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(List.of(10, 20, 30, 40, 50));

        int actual = instance.addValues(2, array, list);
        assertEquals(33, actual);
    }

    @Test
    void arraySum() {
        int[] array = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        int actual = instance.arraySum(array);
        assertEquals(10, actual);
    }
}