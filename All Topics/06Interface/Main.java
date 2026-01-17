// Define an interface called Car with method signatures
// Interfaces define a contract that implementing classes must follow
interface Car {
    // Abstract method - must be implemented by any class that implements Car
    // No method body, just the signature
    public void Start();

    // Abstract method - must be implemented by any class that implements Car
    public void GearType();

    // Default method (introduced in Java 8) - provides a default implementation
    // Classes can use this default implementation OR override it with their own
    default void AirBags() {
        System.out.println("Your car has 5 Air Bags");
    }
}

// ManualCar class implements the Car interface
// This means it MUST provide implementations for all abstract methods
class ManualCar implements Car {

    // Implementation of the abstract Start() method from Car interface
    // The @Override annotation (optional but recommended) indicates we're
    // implementing an interface method
    public void Start() {
        System.out.println("The Manual Car is starting!");
    }

    // Implementation of the abstract GearType() method from Car interface
    public void GearType() {
        System.out.println("This manual car has 5 gear");
    }

    // OVERRIDING the default AirBags() method from Car interface
    // This is optional - we could have skipped this and used the default
    // implementation
    // By defining it here, we replace the interface's default behavior with our
    // custom behavior
    public void AirBags() {
        System.out.println("This manual car has 6 air bags");
    }

}

public class Main {
    public static void main(String[] args) {
        // Create an instance of ManualCar
        ManualCar manualCar1 = new ManualCar();

        // Call the Start() method - uses ManualCar's implementation
        manualCar1.Start();

        // Call the GearType() method - uses ManualCar's implementation
        manualCar1.GearType();

        // Call the AirBags() method - uses ManualCar's OVERRIDDEN version
        // NOT the default method from the interface (that would print "5 Air Bags")
        // This prints "6 air bags" because ManualCar overrode the default
        manualCar1.AirBags();
    }
}