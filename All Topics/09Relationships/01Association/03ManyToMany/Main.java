import java.util.*;

/**
 * Student class represents a student in the system.
 * Maintains a many-to-many relationship with Course.
 */
class Student {
    // Private instance variables
    private String name;
    private List<Course> courses; // List of courses this student is enrolled in

    /**
     * Constructor to initialize a student with a name
     * 
     * @param name The name of the student
     */
    Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    /**
     * Getter method for student name
     * 
     * @return The name of the student
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method for courses list
     * 
     * @return List of courses the student is enrolled in
     */
    public List<Course> getCourses() {
        return courses;
    }

    /**
     * Enrolls the student in a course.
     * This method maintains the bidirectional relationship by also
     * adding this student to the course's student list.
     * 
     * @param course The course to enroll in
     */
    public void enrollInCourse(Course course) {
        // Check if student is not already enrolled to avoid duplicates
        if (!courses.contains(course)) {
            courses.add(course); // Add course to student's list
            course.addStudent(this); // Add student to course's list (bidirectional)
        }
    }

    /**
     * Drops a course for the student.
     * This method maintains the bidirectional relationship by also
     * removing this student from the course's student list.
     * 
     * @param course The course to drop
     */
    public void dropCourse(Course course) {
        // Check if student is enrolled in the course
        if (courses.contains(course)) {
            courses.remove(course); // Remove course from student's list
            course.removeStudent(this); // Remove student from course's list (bidirectional)
        }
    }

    /**
     * Displays all courses the student is enrolled in
     */
    public void displayCourses() {
        System.out.println(name + " is enrolled in:");
        // Iterate through all courses
        for (Course course : courses) {
            System.out.println("  - " + course.getName());
        }
    }
}

/**
 * Course class represents a course in the system.
 * Maintains a many-to-many relationship with Student.
 */
class Course {
    // Private instance variables
    private String name;
    private List<Student> students; // List of students enrolled in this course

    /**
     * Constructor to initialize a course with a name
     * 
     * @param name The name of the course
     */
    Course(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    /**
     * Getter method for course name
     * 
     * @return The name of the course
     */
    public String getName() {
        return name;
    }

    /**
     * Getter method for students list
     * 
     * @return List of students enrolled in the course
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Adds a student to the course (package-private for internal use).
     * This method is called by Student.enrollInCourse() to maintain
     * the bidirectional relationship. It's not public to prevent
     * inconsistent state (where a student is added to course but
     * course is not added to student).
     * 
     * @param student The student to add
     */
    void addStudent(Student student) {
        // Check if student is not already enrolled to avoid duplicates
        if (!students.contains(student)) {
            students.add(student); // Add student to course's list
        }
    }

    /**
     * Removes a student from the course (package-private for internal use).
     * This method is called by Student.dropCourse() to maintain
     * the bidirectional relationship.
     * 
     * @param student The student to remove
     */
    void removeStudent(Student student) {
        students.remove(student); // Remove student from course's list
    }

    /**
     * Displays all students enrolled in the course
     */
    public void displayStudents() {
        System.out.println("Students enrolled in " + name + ":");
        // Iterate through all students
        for (Student student : students) {
            System.out.println("  - " + student.getName());
        }
    }
}

/**
 * Main class to demonstrate the many-to-many association
 * between Student and Course classes
 */
public class Main {
    public static void main(String[] args) {
        // Create student objects
        Student alice = new Student("Alice");
        Student bob = new Student("Bob");
        Student charlie = new Student("Charlie");

        // Create course objects
        Course math = new Course("Mathematics");
        Course physics = new Course("Physics");
        Course chemistry = new Course("Chemistry");

        // Enroll students in multiple courses (demonstrating many-to-many relationship)
        // Alice enrolls in Math and Physics
        alice.enrollInCourse(math);
        alice.enrollInCourse(physics);

        // Bob enrolls in Math and Chemistry
        bob.enrollInCourse(math);
        bob.enrollInCourse(chemistry);

        // Charlie enrolls in all three courses
        charlie.enrollInCourse(physics);
        charlie.enrollInCourse(chemistry);
        charlie.enrollInCourse(math);

        // Display each student and their enrolled courses
        System.out.println("=== Students and their Courses ===");
        alice.displayCourses();
        System.out.println();
        bob.displayCourses();
        System.out.println();
        charlie.displayCourses();

        // Display each course and its enrolled students
        System.out.println("\n=== Courses and their Students ===");
        math.displayStudents();
        System.out.println();
        physics.displayStudents();
        System.out.println();
        chemistry.displayStudents();

        // Demonstrate dropping a course
        System.out.println("\n=== After Charlie drops Mathematics ===");
        charlie.dropCourse(math); // Charlie drops Math course

        // Show updated enrollment
        charlie.displayCourses(); // Charlie's remaining courses
        System.out.println();
        math.displayStudents(); // Math course's remaining students
    }
}