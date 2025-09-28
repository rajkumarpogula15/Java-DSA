public class GetterSetterDemo {
    // Private fields (Encapsulation)
    private String message;
    private int number;

    // Getter for 'message'
    public String getMessage() {
        return message;
    }

    // Setter for 'message'
    public void setMessage(String message) {
        this.message = message;
    }

    // Getter for 'number'
    public int getNumber() {
        return number;
    }

    // Setter for 'number'
    public void setNumber(int number) {
        if (number >= 0) { // simple validation
            this.number = number;
        } else {
            System.out.println("Number must be non-negative!");
        }
    }

    // Main method to test getters and setters
    public static void main(String[] args) {
        GetterSetterDemo obj = new GetterSetterDemo();

        // Using setters
        obj.setMessage("Hello, Rajkumar!");
        obj.setNumber(100);

        // Using getters
        System.out.println("Message: " + obj.getMessage());
        System.out.println("Number: " + obj.getNumber());

        // Trying invalid number
        obj.setNumber(-10); // will print validation message
    }
}
