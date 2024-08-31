package course3.examples;
/**
 * Polymorphism in Java means that more than one class can have the same method name with different implementations.
 *   Polymorphism in Java requires inheritance, either through a class or through interfaces.
 * The actual implementation of a method depends on the class of the object, not the reference type.
 */
public class Polymorphism {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog(); // notice the class is defined as Animal, not Dog
        Animal cat = new Cat();

        animal.makeSound(); // Output: "The animal makes a sound"
        dog.makeSound(); // Output: "The dog barks"
        cat.makeSound(); // Output: "The cat meows"
    }
}

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("The cat meows");
    }
}