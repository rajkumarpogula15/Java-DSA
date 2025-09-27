// A class to demonstrate different access modifiers
class Student {
    // private → accessible only within the same class
    private String name;

    // default (no modifier) → accessible within the same package
    int age;

    // protected → accessible within the same package and by subclasses
    protected String course;

    // public → accessible everywhere
    public String university;

    // Constructor
    public Student(String name, int age, String course, String university) {
        this.name = name;
        this.age = age;
        this.course = course;
        this.university = university;
    }

    // Public method to access private field (getter)
    public String getName() {
        return name;
    }

    // Private method → can be used only inside this class
    private void showSecret() {
        System.out.println("This is a private method.");
    }

    // Public method that calls private method
    public void revealSecret() {
        showSecret();
    }
}

// Main class (must match file name)
public class AccessModifierDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Rajkumar", 21, "Computer Science", "JNTUHUCEJ");

        // Accessing fields
        // System.out.println(s1.name); ❌ Error (private)
        System.out.println("Name: " + s1.getName()); // ✅ via public getter
        System.out.println("Age: " + s1.age);        // ✅ default
        System.out.println("Course: " + s1.course);  // ✅ protected (same package)
        System.out.println("University: " + s1.university); // ✅ public

        // Accessing methods
        // s1.showSecret(); ❌ Error (private)
        s1.revealSecret(); // ✅ calls private method internally
    }
}
