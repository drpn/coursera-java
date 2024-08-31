package course3.examples;

// Here's an example of how you can create a parent class called "Car" and a child class called "StationWagon" that inherits from the Car class

// In this example, the Car class is the parent class and the StationWagon class is the child class. The StationWagon class inherits all the attributes and methods of the Car class using the `extends` keyword. The StationWagon class also adds its own specific attributes `cargoCapacity` and `currentCargoLoad`.

// In the `main` method, we create an instance of the Car class and an instance of the StationWagon class. We can access the attributes and methods of both classes using their respective objects.

// Usage example
class Car {
    protected int speed;
    private String gasoline;
    private boolean engineState;

    public Car(int speed, String gasoline, boolean engineState) {
        this.speed = speed;
        this.gasoline = gasoline;
        this.engineState = engineState;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getGasoline() {
        return gasoline;
    }

    public void setGasoline(String gasoline) {
        this.gasoline = gasoline;
    }

    public boolean isEngineState() {
        return engineState;
    }

    public void setEngineState(boolean engineState) {
        this.engineState = engineState;
    }
}

// Child class
class StationWagon extends Car {
    private int cargoCapacity;
    private int currentCargoLoad;

    public StationWagon(int speed, String gasoline, boolean engineState, int cargoCapacity, int currentCargoLoad) {
        super(speed, gasoline, engineState);
        this.cargoCapacity = cargoCapacity;
        this.currentCargoLoad = currentCargoLoad;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getCurrentCargoLoad() {
        return currentCargoLoad;
    }

    public void setCurrentCargoLoad(int currentCargoLoad) {
        this.currentCargoLoad = currentCargoLoad;
    }
}

// Main class
public class InheritanceExample {
    public static void main(String[] args) {
        Car car = new Car(0, "Regular", false);
        StationWagon stationWagon = new StationWagon(0, "Regular", false, 500, 0);

        System.out.println("Car Speed: " + car.getSpeed());
        System.out.println("Station Wagon Speed: " + stationWagon.getSpeed());
        System.out.println("Station Wagon Cargo Capacity: " + stationWagon.getCargoCapacity());
        System.out.println("Station Wagon Current Cargo Load: " + stationWagon.getCurrentCargoLoad());
    }
}