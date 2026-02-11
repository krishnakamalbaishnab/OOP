/**
 * Passport class - can exist independently
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
 * Student class - HAS-A Passport (Aggregation)
 */
class Student {
    private String name;
    private Passport passport; // Aggregation - passport passed in, not created here

    // Student gets an existing passport
    public Student(String name, Passport passport) {
        this.name = name;
        this.passport = passport;
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
        // Create passport first (exists independently)
        Passport passport = new Passport("A123456");

        // Create student with the passport
        Student alice = new Student("Alice", passport);

        System.out.println("\nAlice has passport: " + alice.getPassport().getPassportNumber());

        // Destroy student object
        alice = null;
        System.out.println("\nStudent destroyed");

        // Passport still exists! (Aggregation)
        System.out.println("Passport still exists: " + passport.getPassportNumber());
    }
}