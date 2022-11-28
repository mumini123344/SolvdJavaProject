package transportation;

import interfaces.IStartEngine;
import interfaces.IStopEngine;
import people.Driver;

public class Motorbike extends Vehicle implements IStartEngine, IStopEngine {
    public Motorbike(String typeOfVehicle, String engine, String color, String model, String capacity,
                     String fuelType, double maxSpeed, int wheels, Driver driver) {
        super(typeOfVehicle, engine, color, model, capacity, fuelType, maxSpeed, wheels, driver);

    }

    public Motorbike() {

    }

    public void go(){
        System.out.println("Bike is moving");
    }

    @Override
    public final void startEngine() {
        System.out.println("Driver started Engine");
    }

    @Override
    public final void stopEngine() {
        System.out.println("Driver Stopped Engine");

    }
}
