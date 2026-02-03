import java.util.*;

// Calculator Class
class Calculator {
    // Method to add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Method to add two decimal values
    double add(double a, double b) {
        return a + b;
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Method resolution happens here based on the argument types (int vs double)
        System.out.println(calc.add(5, 3)); // Calls int version
        System.out.println(calc.add(5.5, 3.3)); // Calls double version
    }
}
