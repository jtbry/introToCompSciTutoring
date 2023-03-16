package edu.uncc.jbryan76.examples;

import java.util.ArrayList;

public class Inheritance {
    // IMPORTANT: You should rarely write code like this. Having inner classes
    //  is usually a bad idea. It is only done here to preserve the readability and structure
    //  of the project. see: https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html

    // The following code will define a super class. This is the class we can inherit from.
    // In this example we have different types of animals but, importantly, they are still all animals.
    public class Animal {
        // All animals have an age
        public int age;

        // Set the age in a constructor
        public Animal(int age) {
            this.age = age;
        }

        // All animals can run
        public void run() {}
    }

    // The following code is a subclass, Ducks are animals, so we should extend from Animal.
    public class Duck extends Animal {
        public int beakLength;

        // We can provide a constructor for the Duck class
        // But we still have to call the 'super' constructor
        // This is because all Ducks are Animals but not all Animals are Ducks
        public Duck(int age, int beakLength) {
            super(age);
            this.beakLength = beakLength;
        }

        // Only ducks quack
        public void quack() {
            System.out.println("Quack with a " + beakLength + "in beak!");
        }
    }

    // The following method demonstrates the usage of the subclass
    public void demonstrate() {
        Duck donald = new Duck(10, 2);
        donald.run();

        // We can use the age field from the Animal super class
        // even though donald is an instance of Duck
        System.out.println("Donald is " + donald.age);
        donald.quack();

        // To showcase that donald is still an animal, we can put him in a list of Animals
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(donald);
        System.out.println("Animals contains donald: " + animals.contains(donald));

        // This can be useful for situations where you have multiple types of something with shared similarity.
        // Imagine you have a website with membership levels. You can store all your members in a single
        // Member list and still operate on each list item as a PremiumMember, StandardMember, SuperMember etc.
        // The following code demonstrates how we can use donald as a Duck after putting him in an Animal list
        for (Animal animal : animals) {
            if (animal instanceof Duck) {
                // The following code will cast the animal variable to the Duck class only if
                // animal is an instanceof Duck
                Duck duck = (Duck)animal;
                System.out.println("Donald has a beakLength of " + duck.beakLength);
            }
        }
    }
}
