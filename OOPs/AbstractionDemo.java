// Abstract class
abstract class Vehicle {
    // Abstract method (no body)
    abstract void start();

    // Concrete (non-abstract) method
    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

// Subclass 1
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started with a key.");
    }
}

// Subclass 2
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike started with a self-start button.");
    }
}

// Main Class
public class AbstractionDemo {
    public static void main(String[] args) {
        Vehicle car = new Car();   // Upcasting
        Vehicle bike = new Bike();

        car.start();  // Calls Car's implementation
        car.stop();

        bike.start(); // Calls Bike's implementation
        bike.stop();
    }
}
