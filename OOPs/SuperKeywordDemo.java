// Parent class
class Animal {
    String color = "White";

    Animal() {
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println("Animal is eating...");
    }
}

// Child class
class Dog extends Animal {
    String color = "Black";

    Dog() {
        super(); // Calls parent class constructor
        System.out.println("Dog constructor called");
    }

    void showColor() {
        System.out.println("Dog color: " + color);           // child class variable
        System.out.println("Animal color: " + super.color);  // access parent variable
    }

    void eat() {
        System.out.println("Dog is eating biscuits...");
        super.eat();  // call parent class method
    }
}

// Main class
public class SuperKeywordDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.showColor();
        d.eat();
    }
}
