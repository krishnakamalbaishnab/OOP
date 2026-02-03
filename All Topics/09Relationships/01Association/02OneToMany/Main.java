// Teacher class - represents a teacher
// In a one-to-many relationship, one Teacher can teach many Students
class Teacher {
    private String name;

    // Constructor
    Teacher(String name) {
        this.name = name;
    }

    // Getter method
    public String getName() {
        return name;
    }
}

// Student class - represents a student
class Student {
    private String name;
    private int rollNumber;

    // Constructor
    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("Roll No: " + rollNumber + ", Name: " + name);
    }
}

// Classroom class - demonstrates ONE-TO-MANY relationship
// ONE Teacher teaches MANY Students
class Classroom {
    private Teacher teacher; // ONE teacher
    private Student[] students; // MANY students (array to hold multiple students)
    private int studentCount; // Counter to track number of students

    // Constructor
    // ONE-TO-MANY: One Classroom has one teacher but can have multiple students
    Classroom(Teacher teacher, int maxStudents) {
        this.teacher = teacher;
        this.students = new Student[maxStudents]; // Array to hold many students
        this.studentCount = 0;
    }

    // Method to add a student to the classroom
    // Demonstrates the "MANY" part - we can add multiple students
    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = student;
            studentCount++;
            System.out.println("Student added successfully!");
        } else {
            System.out.println("Classroom is full!");
        }
    }

    // Method to display classroom details
    // Shows ONE teacher with MANY students
    public void displayClassroom() {
        System.out.println("\n========== CLASSROOM DETAILS ==========");
        System.out.println("Teacher: " + teacher.getName());
        System.out.println("Number of Students: " + studentCount);
        System.out.println("\nStudent List:");
        System.out.println("-------------");

        // Loop through all students - demonstrating ONE-TO-MANY
        // ONE teacher is associated with MANY students
        for (int i = 0; i < studentCount; i++) {
            students[i].displayInfo();
        }
        System.out.println("=======================================\n");
    }
}

public class Main {
    public static void main(String[] args) {
        // Step 1: Create ONE Teacher object
        Teacher teacher1 = new Teacher("Dr. Smith");

        // Step 2: Create a Classroom with this teacher
        // ONE-TO-MANY: One classroom has one teacher but can hold many students
        Classroom classroom = new Classroom(teacher1, 5);

        // Step 3: Create MANY Student objects
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);
        Student student3 = new Student("Charlie", 103);
        Student student4 = new Student("Diana", 104);

        // Step 4: Add MANY students to the classroom
        // Demonstrates ONE-TO-MANY: ONE teacher teaches MANY students
        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);
        classroom.addStudent(student4);

        // Step 5: Display the classroom details
        // Shows the one-to-many relationship in action
        classroom.displayClassroom();
    }
}