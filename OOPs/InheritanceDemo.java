class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person details
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class (Child class)
class Student extends Person {
    String course;

    // Constructor using super keyword to call parent constructor
    Student(String name, int age, String course) {
        super(name, age); // call to Person's constructor
        this.course = course;
    }

    // Method to display student details
    void displayStudentInfo() {
        // Call base class method
        super.displayInfo();
        System.out.println("Course: " + course);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        // Create a Student object
        Student s1 = new Student("Rajkumar", 21, "Computer Science");

        // Display student information
        s1.displayStudentInfo();
    }
}
