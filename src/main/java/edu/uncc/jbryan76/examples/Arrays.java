package edu.uncc.jbryan76.examples;

import java.util.ArrayList;

public class Arrays {

    public void creatingArrays() {
        // The most straight-forward way to define a constant array. You will not see this often in real code.
        // Note: this array type is still primitive like seen below, just the elements are pre-defined.
        int[] constants = new int[] { 1, 2, 3, 4, 5};
        System.out.println("Constants has " + constants.length + " elements");

        // The more standard way, a primitive array with a size.
        int[] primitive = new int[30];
        System.out.println("Primitive has " + primitive.length + " elements");

        // The most useful way, using an ArrayList. (ArrayLists are fancy arrays with all the dirty work handled for you)
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("List has " + list.size() + " elements");
    }

    public void addToArrays() {
        // This will create an array that can hold 5 elements and then fill it with the values 1, 2, 3, 4, 5
        int[] primitive = new int[5];
        primitive[0] = 1;
        primitive[1] = 2;
        primitive[2] = 3;
        primitive[3] = 4;
        primitive[4] = 5;
        System.out.println("Primitive[0] = " + primitive[0] + ", Primitive[4] = " + primitive[4]);

        // This will do the same as above but use an array list
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("List at 0: " + list.get(0) + ", List at 4: " + list.get(4));
    }

    public void iterateArrays() {
        int[] primitive = new int[] { 1, 2, 3, 4, 5};
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Iterate using a for loop.
        for(int i = 0; i < primitive.length; i++) {
            System.out.println("Primitive[" + i + "] = " + primitive[i]);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println("List at " + i + ": " + list.get(i));
        }

        // Iterate using a for each loop
        for (int x: primitive) {
            System.out.println("Primitive element: " + x);
        }
        for (int x: list) {
            System.out.println("List element: " + x);
        }
    }
}
