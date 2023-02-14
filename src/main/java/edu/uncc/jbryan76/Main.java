package edu.uncc.jbryan76;

import edu.uncc.jbryan76.examples.Arrays;
import edu.uncc.jbryan76.examples.Conditionals;
import edu.uncc.jbryan76.examples.Loops;

public class Main {
    // The main method only runs the examples
    // Exercises should be checked with Unit Tests
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        // Conditionals
        System.out.println("--- Conditionals ---");
        Conditionals conditionals = new Conditionals();
        conditionals.booleanEval();
        System.out.println("--");
        conditionals.expressionEval();
        System.out.println("--");
        conditionals.switchStatements();
        System.out.println("\n");

        // Loops
        System.out.println("--- Loops ---");
        Loops loops = new Loops();
        loops.forLoop();
        System.out.println("--");
        loops.whileLoop();
        System.out.println("--");
        loops.forEachLoop();
        System.out.println("\n");

        // Arrays
        System.out.println("--- Arrays ---");
        Arrays arrays = new Arrays();
        arrays.creatingArrays();
        System.out.println("--");
        arrays.addToArrays();
        System.out.println("--");
        arrays.iterateArrays();
        System.out.println("\n");

    }
}
