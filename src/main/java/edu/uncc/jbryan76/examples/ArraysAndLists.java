package edu.uncc.jbryan76.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ArraysAndLists {

    // A primitive array is a simple form of a list of values in continuous memory
    public void primitiveArrays() {
        // The simplest form of a primitive array is one defined with the values inline as seen below
        // The following code creates an array variable named inline holding the values 1, 2, 3, 4, 5
        int[] inline = new int[] { 1, 2, 3, 4, 5};
        System.out.println("Inline length: " + inline.length);

        // A more common form of a primitive array is one where you define only the size and fill it with code.
        // The following code creates an array that can hold three elements and sets the three elements to 1, 2, 3
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        System.out.println("Original length: " + array.length);

        // Primitive arrays can not be easily resized, you must create a new array and copy the previous values
        // There is a helper function in java that can do this for you named Arrays.copyOf
        // The following line of code will now allow the array variable to hold 6 elements
        // and will copy the first 3 from the original array
        array = Arrays.copyOf(array, 6);
        System.out.println("New length: " + array.length);
    }

    // ArrayLists have generally the same use cases as arrays, but they are more flexible and
    // come with a lot of useful methods included
    public void arrayLists() {
        // The following line of code will create a new ArrayList that can hold Integers, it starts with no elements.
        // Pay attention to the use of Integer. ArrayLists can only use objects, not primitive types.
        ArrayList<Integer> list = new ArrayList<>();

        // ArrayLists behave the same as primitive arrays allowing you to add, get remove values and more
        // The following code will add a value, get the value from the first (0) index and then remove it.
        list.add(1);
        // ArrayList indexes also begin at 0
        list.get(0);
        list.remove(0);
        // The ArrayList now has [ 10 ] for values.
        list.add(10);

        // ArrayLists include a number of useful functions like contains, indexOf
        list.contains(10); // TRUE
        list.indexOf(10); // 0
        list.set(0, 100); // value 10 at index 0 is now 100

        // Add two more elements and print the list size
        list.add(1);
        list.add(2);
        System.out.println("List size: " + list.size());

        // Add another element to illustrate growth
        list.add(3);
        System.out.println("New list size: " + list.size());
    }

    // Iterating arrays and arraylists are fundamentally the same
    public void iterating() {
        // Create a primitive array and array list with the values 1, 2, 3, 4, 5
        int[] array = new int[] { 1, 2, 3, 4, 5 };
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(List.of(1, 2, 3, 4, 5));

        // Using conventional for loops
        // The following code iterates a primitive array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // The following code iterates an array list.
        // Notice we use .size() instead of .length
        // We also use .get(i) instead of [i]
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // Using foreach loops, notice foreach loops don't have access to an index.
        for (int x : array) {
            System.out.print(x + " ");
        }
        System.out.println();

        for (int x : list) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
