// Example of Polymorphism in Java
class Shape {
    // Method to be overridden (Runtime Polymorphism)
    void draw() {
        System.out.println("Drawing a shape");
    }

    // Method Overloading (Compile-time Polymorphism)
    void area(int side) {
        System.out.println("Square Area = " + (side * side));
    }

    void area(int length, int breadth) {
        System.out.println("Rectangle Area = " + (length * breadth));
    }
}

// Subclass 1
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Subclass 2
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Triangle");
    }
}

// Main Class
public class PolymorphismDemo {
    public static void main(String[] args) {
        // ---------- Compile-time Polymorphism ----------
        Shape shape = new Shape();
        shape.area(5);            // Calls area(int side)
        shape.area(4, 6);         // Calls area(int length, int breadth)

        // ---------- Runtime Polymorphism ----------
        Shape s1 = new Circle();   // Upcasting
        Shape s2 = new Triangle();

        s1.draw(); // Calls Circle's draw() → "Drawing a Circle"
        s2.draw(); // Calls Triangle's draw() → "Drawing a Triangle"
    }
}
