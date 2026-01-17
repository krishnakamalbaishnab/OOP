import java.util.*;

// Parent class representing general animals
class Animal {
    // Method to define the eating behavior common to all animals
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Subclass representing dogs, inheriting from Animal
class Dog extends Animal {
    // Method to define the barking behavior specific to dogs
    void bark() {
        System.out.println("This dog barks.");
    }
}

// Subclass representing cats, inheriting from Animal
class Cat extends Animal {
    // Method to define the meowing behavior specific to cats
    void meow() {
        System.out.println("This cat meows.");
    }
}

// Main class to demonstrate hierarchical inheritance
class Main {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog dog = new Dog();

        // Create an object of the Cat class
        Cat cat = new Cat();

        // Call the eat method inherited from the Animal class using the Dog object
        dog.eat(); // Output: This animal eats food.

        // Call the bark method specific to the Dog class
        dog.bark(); // Output: This dog barks.

        // Call the eat method inherited from the Animal class using the Cat object
        cat.eat(); // Output: This animal eats food.

        // Call the meow method specific to the Cat class
        cat.meow(); // Output: This cat meows.
    }
}
