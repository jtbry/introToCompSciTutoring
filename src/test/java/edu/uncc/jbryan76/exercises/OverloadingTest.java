package edu.uncc.jbryan76.exercises;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class OverloadingTest {
    Overloading instance = new Overloading();

    @Test
    public void testConstructorExist() {
        Class c = instance.getClass();
        try {
            Class[] paramTypes = new Class[] {int.class, double.class};
            c.getConstructor(paramTypes);
        } catch (NoSuchMethodException ex) {
            fail("Missing constructor with int, double params");
        }
    }

    @Test
    public void testMethodsExist() {
        Class c = instance.getClass();
        try {
            Class[] overloadOneParams = new Class[] { int.class };
            Class[] overloadTwoParams = new Class[] { String.class };
            c.getMethod("work", overloadOneParams);
            c.getMethod("work", overloadTwoParams);
        } catch (NoSuchMethodException ex) {
            fail("Make sure you have a method for int and string");
        }
    }
}