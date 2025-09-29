// Example program to demonstrate constructors in Java
class Student {
    String name;
    int age;

    // 1. Default Constructor
    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("Default Constructor called");
    }

    // 2. Parameterized Constructor
    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterized Constructor called");
    }

    // 3. Copy Constructor
    Student(Student s) {
        name = s.name;
        age = s.age;
        System.out.println("Copy Constructor called");
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        // Using Default Constructor
        Student s1 = new Student();
        s1.display();

        // Using Parameterized Constructor
        Student s2 = new Student("Rajkumar", 22);
        s2.display();

        // Using Copy Constructor
        Student s3 = new Student(s2);
        s3.display();
    }
}
