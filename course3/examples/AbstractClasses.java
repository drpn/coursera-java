package course3.examples;

/**
 * 
An abstract class is a class that cannot be instantiated, but references of it can be created.
Abstract classes can include attributes, methods, and abstract methods.

Abstract methods have no code and are placeholders with a signature.

Abstract classes are used when you have attributes and method implementations that you want to share with subclasses, but you don't want to create instances of the abstract class itself.

 */

public class AbstractClasses {
    abstract class Vehicle {
        protected int speed;
        
        public void start() {
            System.out.println("Vehicle started");
        }
        
        public abstract void setSpeed(int speed);
    }

    // Concrete class extending the abstract class
    class Car extends Vehicle {
        @Override
        public void setSpeed(int speed) {
            this.speed = speed;
            System.out.println("Car speed set to " + speed);
        }
    }

    // Concrete class extending the abstract class
    class Bike extends Vehicle {
        @Override
        public void setSpeed(int speed) {
            this.speed = speed;
            System.out.println("Bike speed set to " + speed);
        }
    }

    
    public static void main(String[] args) {
        Car car = new AbstractClasses().new Car();
        car.start();
        car.setSpeed(100);
        
        Bike bike = new AbstractClasses().new Bike();
        bike.start();
        bike.setSpeed(50);
    }
}
