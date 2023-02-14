package edu.uncc.jbryan76.examples;

public class Loops {
    // A simple for loop counting to 10, starting from 0.
    public void forLoop() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    // A simple while loop counting from 10 starting from 0.
    public void whileLoop() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    // A for each loop iterating through an array.
    public void forEachLoop() {
        int[] array = new int[] { 1, 2, 3, 4, 5 };
        for(int x : array) {
            System.out.println(x);
        }
    }
}
