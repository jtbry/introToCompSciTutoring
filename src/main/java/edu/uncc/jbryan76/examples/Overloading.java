package edu.uncc.jbryan76.examples;

public class Overloading {
    // Default constructor
    public Overloading() {
        System.out.println("Default Constructor");
    }

    // Overloaded constructor
    // We can use the same method name (constructor) but have different arguments
    public Overloading(int a, int b) {
        System.out.println("Overloaded Constructor: " + (a + b));
    }

    // Method overloading works the same but with normal methods instead of constructors
    // You can change the return type of an overload but you still have to change the parameters too
    public int add(int a, int b) {
        return a + b;
    }

    // For example, we want to handle adding doubles as well we can create an overload.
    public double add(double a, double b) {
        return a + b;
    }
}
