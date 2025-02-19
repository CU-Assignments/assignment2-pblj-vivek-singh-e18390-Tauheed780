// Abstract base class: Person
abstract class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method to be overridden by subclasses
    public abstract void displayDetails();
}

// Derived class: Student
class Student extends Person {
    private int rollNumber;

    // Constructor
    public Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}

// Derived class: Teacher
class Teacher extends Person {
    private String subject;

    // Constructor
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    // Overriding displayDetails method
    @Override
    public void displayDetails() {
        System.out.println("\nTeacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

// Main class to test the Student Information System
public class StudentInfoSystem {
    public static void main(String[] args) {
        // Creating objects
        Student student = new Student("Alice", 20, 101);
        Teacher teacher = new Teacher("Mr. Smith", 45, "Mathematics");

        // Display details
        student.displayDetails();
        teacher.displayDetails();
    }
}
