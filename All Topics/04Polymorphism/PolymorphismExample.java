// Example demonstrating Polymorphism in Java
// Polymorphism allows a parent class reference
// to refer to a child class object

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {

        // Parent class reference holding child class objects
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        // Runtime Polymorphism
        animal1.sound();
        animal2.sound();
    }
}
