/**
 * Passport class - cannot exist independently in this composition example
 */
class Passport {
    private String passportNumber;
    
    public Passport(String passportNumber) {
        this.passportNumber = passportNumber;
        System.out.println("Passport " + passportNumber + " created");
    }
    
    public String getPassportNumber() {
        return passportNumber;
    }
}

/**
 * Student class - HAS-A Passport (Composition)
 */
class Student {
    private String name;
    private Passport passport; // Composition - passport created here, not passed in

    // Student creates their own passport
    public Student(String name, String passportNumber) {
        this.name = name;
        this.passport = new Passport(passportNumber); // Passport created inside Student
        System.out.println("Student " + name + " created");
    }

    public String getName() {
        return name;
    }

    public Passport getPassport() {
        return passport;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create student (passport is created automatically inside)
        Student alice = new Student("Alice", "A123456");

        System.out.println("\nAlice has passport: " + alice.getPassport().getPassportNumber());

        // Destroy student object
        alice = null;
        System.out.println("\nStudent destroyed");
        System.out.println("Passport is also destroyed! (no way to access it)");

        // No reference to passport exists anymore - it's gone!
    }
}