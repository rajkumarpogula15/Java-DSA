// Define an interface
interface Vehicle {
    void start(); // abstract method (no body)

    void stop(); // abstract method (no body)
}

// Implementing class 1
class Car implements Vehicle {
    public void start() {
        System.out.println("Car started with a key.");
    }

    public void stop() {
        System.out.println("Car stopped with a brake pedal.");
    }
}

// Implementing class 2
class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike started with a self-start button.");
    }

    public void stop() {
        System.out.println("Bike stopped using hand brakes.");
    }
}

// Main class
public class InterfaceDemo {
    public static void main(String[] args) {
        Vehicle car = new Car(); // Upcasting to interface
        Vehicle bike = new Bike();
        car.start();
        car.stop();
        bike.start();
        bike.stop();
    }
}
