// Abstract class demonstrating Abstraction
abstract class Vehicle {
    private String brand; // Encapsulation

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String getBrand() { // Getter method
        return brand;
    }

    public void setBrand(String brand) { // Setter method
        this.brand = brand;
    }

    // Abstract method
    abstract void start();
}

// Inheritance: Car is a subclass of Vehicle
class Car extends Vehicle {
    private int doors;

    public Car(String brand, int doors) {
        super(brand);
        this.doors = doors;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    // Polymorphism: Overriding start() method
    @Override
    void start() {
        System.out.println(getBrand() + " car is starting with " + doors + " doors.");
    }
}

// Inheritance: Bike is another subclass of Vehicle
class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String brand, boolean hasCarrier) {
        super(brand);
        this.hasCarrier = hasCarrier;
    }

    public boolean hasCarrier() {
        return hasCarrier;
    }

    public void setCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }

    @Override
    void start() {
        System.out.println(getBrand() + " bike is starting. Carrier available: " + hasCarrier);
    }
}

// Main class
public class OOPsConcepts {
    public static void main(String[] args) {
        // Creating objects
        Car car = new Car("Toyota", 4);
        Bike bike = new Bike("Honda", true);

        // Using polymorphic behavior
        Vehicle[] vehicles = { car, bike };
        for (Vehicle v : vehicles) {
            v.start();
        }
    }
}
