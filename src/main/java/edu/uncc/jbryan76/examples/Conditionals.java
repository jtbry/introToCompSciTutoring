package edu.uncc.jbryan76.examples;

public class Conditionals {
    // The simplest form of an if statement is checking a boolean value
    public void booleanEval() {
        boolean value = true;

        // The basic if statement
        if (value) {
            System.out.println("Value is true");
        } else {
            System.out.println("Value is false");
        }

        // Flip the statement (check for the opposite)
        if (!value) {
            System.out.println("Value is false");
        } else {
            System.out.println("Value is true");
        }
    }

    // If statements become more advanced when you start to evaluate expressions
    public void expressionEval() {
        int x = 1;
        int y = 1;

        // We evaluate the expression X is equal to Y which may be either true or false
        if (x == y) {
            System.out.println("X is equal to Y");
        } else {
            System.out.println("X is not equal to Y");
        }

        // We evaluate the expression X is equal to Y AND Y is equal to 1
        if (x == y && y == 1) {
            System.out.println("Both X and Y are equal to 1");
        } else {
            System.out.println("Neither X nor Y are equal to 1");
        }

        // We evaluate the expression X is equal to Y OR Y is equal to 2
        if (x == y || y == 2) {
            System.out.println("X is equal to Y or Y is equal to 2");
        } else {
            System.out.println("X is not equal to Y and Y is not equal to 2");
        }
    }

    // Another form of evaluation is switch statements, these work similar to if, else if, else statements.
    public void switchStatements() {
        int x = 1;
        switch (x) {
            case 1:
                System.out.println("X is equal to 1");
                break; // Break is important because it stops the switch statement here
            case 2:
            case 3:
                // This is true because there is no break statement between case 2 and case 3
                System.out.println("X is equal to 2 or 3!");
                break;
            default:
                // Default is the last case, this code is ran if no other case is true
                System.out.println("X is not equal to 1, 2, or 3");
                break;
        }
    }

}
