package edu.uncc.jbryan76.exercises;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {
    Arrays instance = new Arrays();

    @Test
    void createArray() {
        int[] actual = instance.createArray();
        int[] expected = new int[] { 1, 2, 3, 4, 5 };
        assertArrayEquals(expected, actual);
    }

    @Test
    void createArrayList() {
        ArrayList<Integer> actual = instance.createArrayList();
        assertTrue(asList(6, 7, 8, 9, 10).equals(actual));
    }

    @Test
    void returnFourthValueArray() {
        int[] array = new int[] { 1, 2, 3, 4, 5 };
        int actual = instance.returnFourthValueArray(array);
        assertEquals(4, actual);
    }

    @Test
    void returnFourthValueArrayList() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int actual = instance.returnFourthValueArrayList(list);
        assertEquals(4, actual);
    }
}