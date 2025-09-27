// A class is like a blueprint
class Car {
    // Data members (fields / attributes)
    String brand;
    int year;

    // Constructor - used to initialize objects
    Car(String b, int y) {
        brand = b;
        year = y;
    }

    // Method - behavior of the object
    void displayInfo() {
        System.out.println("Car Brand: " + brand + ", Year: " + year);
    }
}

// Main class must match file name
public class CarDemo {
    public static void main(String[] args) {
        // Creating objects from the Car class
        Car car1 = new Car("Toyota", 2020);
        Car car2 = new Car("Honda", 2022);

        // Calling methods on objects
        car1.displayInfo(); // Car Brand: Toyota, Year: 2020
        car2.displayInfo(); // Car Brand: Honda, Year: 2022
    }
}
