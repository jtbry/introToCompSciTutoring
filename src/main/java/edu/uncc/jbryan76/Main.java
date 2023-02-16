package edu.uncc.jbryan76;

import edu.uncc.jbryan76.examples.ArraysAndLists;
import edu.uncc.jbryan76.examples.Inheritance;
import edu.uncc.jbryan76.examples.Overloading;

public class Main {
    // The main method only runs the examples
    // Exercises should be checked by running the Unit Tests
    public static void main(String[] args) {
        System.out.println("--- Arrays and Lists ---");
        ArraysAndLists arraysAndLists = new ArraysAndLists();
        System.out.println("- Primitive Arrays -");
        arraysAndLists.primitiveArrays();
        System.out.println("- Array Lists -");
        arraysAndLists.arrayLists();
        System.out.println("- Iterating -");
        arraysAndLists.iterating();
        System.out.println();

        System.out.println("--- Overloading ---");
        Overloading overloading = new Overloading();
        overloading = new Overloading(5, 5);
        System.out.println("Overload int: " + overloading.add(1, 1));
        System.out.println("Overload double: " + overloading.add(1.0, 1.0));
        System.out.println();

        System.out.println("--- Inheritance ---");
        Inheritance inheritance = new Inheritance();
        inheritance.demonstrate();
        System.out.println();
        
    }
}
