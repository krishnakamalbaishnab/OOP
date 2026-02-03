// Passport class - represents a passport document
// In a one-to-one relationship, one Passport belongs to exactly one Student
class Passport{
    // Private instance variable to store passport number
    // Encapsulation: passport number is hidden from outside access
    private String passportNumber;
    
    // Constructor to initialize a Passport object with a passport number
    // ONE-TO-ONE: Each Passport object has exactly one passport number
    Passport(String passportNumber){
        this.passportNumber = passportNumber;
    }

    // Getter method to retrieve the passport number
    // Provides controlled access to the private passportNumber field
    public String getPassportNumber(){
        return passportNumber;
    }
}

// Students class - represents a student
// Demonstrates ONE-TO-ONE ASSOCIATION with Passport class
class Students{
    // Private instance variables
    private String name;
    
    // ONE-TO-ONE RELATIONSHIP: One Student HAS exactly one Passport
    // This is an association where Student class contains a reference to Passport object
    // The relationship: Student ←→ Passport (bidirectional conceptually, unidirectional in code)
    private Passport passport;

    // Parameterized constructor
    // Creates a Student object and ASSOCIATES it with a Passport object
    // ONE-TO-ONE: This student will be linked to exactly one passport
    Students(String name, Passport passport){
        this.name = name;
        this.passport = passport;  // Creating the association/relationship
    }

    // Method to display student details along with passport information
    // Demonstrates how the association is used: Student accesses Passport's data
    // ONE-TO-ONE: We're displaying details of ONE student and their ONE passport
    public void displayDetails(){
        System.out.println("Student name  : " + name);
        // Accessing the associated Passport object's method
        System.out.println("Passport number : " + passport.getPassportNumber());
    }
    
}

public class Main {
    public static void main(String[] args){
        // Step 1: Create a Passport object
        // This passport exists independently first
        Passport passport1 = new Passport("ED6582983F");
        
        // Step 2: Create a Student object and ASSOCIATE it with the Passport
        // ONE-TO-ONE ASSOCIATION: "Harish" (one student) is linked to passport1 (one passport)
        // In real life: One student can have only one passport
        //               One passport belongs to only one student
        Students students = new Students("Harish", passport1);
        
        // Step 3: Display the student's details
        // This demonstrates the relationship: through the Student object,
        // we can access the associated Passport object's information
        students.displayDetails();
    }
}


