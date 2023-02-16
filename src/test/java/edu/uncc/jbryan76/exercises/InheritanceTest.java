package edu.uncc.jbryan76.exercises;

import edu.uncc.jbryan76.exercises.Inheritance;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InheritanceTest {
    Inheritance instance = new Inheritance();

    @Test
    void subclassExists() {
        try {
            Class c = Class.forName("edu.uncc.jbryan76.exercises.Inheritance$Dragon");
            assertTrue(c.getSuperclass().getSimpleName().equals("Monster"));
        } catch (ClassNotFoundException ex) {
            fail("Dragon class not found");
        }
    }

}