// ---------------------------
// ABSTRACTION IN JAVA
// ---------------------------
// An abstract class represents a general concept.
// It can have:
// 1. Abstract methods (no body)
// 2. Concrete methods (with implementation)

abstract class Car {

    // Abstract method
    // This method has NO body.
    // Every subclass of Car MUST implement this method.
    abstract public void Start();

    // Concrete (normal) method
    // This method is already implemented
    // All child classes will automatically inherit this
    public void MakeNoise() {
        System.out.println("The car is making noise");
    }
}

// ---------------------------
// A concrete class that extends Car
// ---------------------------
// Since Car has an abstract method (Start),
// this class MUST provide an implementation for it.
class ManualCar extends Car {

    // Implementing the abstract method
    // This provides the real behavior of Start() for ManualCar
    @Override
    public void Start() {
        System.out.println("The Manual car started!");
    }
}

// ---------------------------
// Main class to test the program
// ---------------------------
public class Main {
    public static void main(String[] args) {

        // We cannot create an object of an abstract class:
        // Car car = new Car(); ❌ Not allowed

        // But we can create an object of a subclass
        ManualCar manualCar1 = new ManualCar();

        // Calling the overridden method
        manualCar1.Start(); // Calls ManualCar's Start()

        // Calling the inherited concrete method
        manualCar1.MakeNoise(); // Calls Car's MakeNoise()
    }
}