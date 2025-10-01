// Parent class (Base class)
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("The cat meows.");
    }
}

// Child class 3
class Cow extends Animal {
    void moo() {
        System.out.println("The cow moos.");
    }
}

// Main class to run program
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat(); // Inherited from Animal
        d.bark(); // Dog's own method

        Cat c = new Cat();
        c.eat(); // Inherited from Animal
        c.meow(); // Cat's own method

        Cow cow = new Cow();
        cow.eat(); // Inherited from Animal
        cow.moo(); // Cow's own method
    }
}
