package course3.examples;

//In this example, the Car class has a brand attribute and an engine attribute, which is an instance of the Engine class. The Car class "has-a" relationship with the Engine class because it contains an engine as one of its components.


class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class Car {
    private String brand;
    private Engine engine;

    public Car(String brand, Engine engine) {
        this.brand = brand;
        this.engine = engine;
    }

    public String getBrand() {
        return brand;
    }

    public Engine getEngine() {
        return engine;
    }
}

public class HasARelationshipExample {
    public static void main(String[] args) {
        Engine engine = new Engine("V6");
        Car car = new Car("Toyota", engine);

        System.out.println("Car Brand: " + car.getBrand());
        System.out.println("Car Engine Type: " + car.getEngine().getType());
    }
}
