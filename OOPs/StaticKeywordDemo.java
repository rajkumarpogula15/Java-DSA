class Student {
    int rollNo;
    String name;
    static String college = "JNTUH";  // Static variable shared by all objects

    // Constructor
    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    // Static method
    static void changeCollegeName(String newCollege) {
        college = newCollege;
    }

    // Display method
    void display() {
        System.out.println(rollNo + " " + name + " - " + college);
    }

    // Static block
    static {
        System.out.println("Static block executed: Class loaded into memory");
    }

    // Static nested class
    static class Helper {
        static void message() {
            System.out.println("Hello from static nested class!");
        }
    }
}

public class StaticKeywordDemo {
    public static void main(String[] args) {
        // Accessing static method without object
        Student.changeCollegeName("JNTU Hyderabad");

        // Creating objects
        Student s1 = new Student(101, "Rajkumar");
        Student s2 = new Student(102, "Anil");

        s1.display();
        s2.display();

        // Accessing static nested class
        Student.Helper.message();
    }
}
