class Student {
    // private fields (data hiding)
    private String name;
    private int age;

    // public getter method for name
    public String getName() {
        return name;
    }

    // public setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // public getter method for age
    public int getAge() {
        return age;
    }

    // public setter method for age
    public void setAge(int age) {
        if (age > 0) { // simple validation
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student s1 = new Student();

        // setting values using setters
        s1.setName("Rajkumar");
        s1.setAge(21);

        // accessing values using getters
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}
