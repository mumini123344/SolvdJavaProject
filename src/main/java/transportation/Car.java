package transportation;

import interfaces.IDrive;
import interfaces.IStartEngine;
import interfaces.IStopEngine;

import people.Driver;




public class Car extends Vehicle implements IStartEngine, IStopEngine, IDrive {
    public Car(String typeOfVihecle, String engine, String color, String model, String capacity,
               String fuelType, double maxSpeed, int wheels, Driver driver) {
        super(typeOfVihecle, engine, color, model, capacity, fuelType, maxSpeed, wheels, driver);


    }

    public Car(String sedan, String engine, String black, String supra, String capacity,
               String gas, int maxSpeed, int wheels) {

    }

    public Car() {

    }

    public void go(){
        System.out.println("Car is moving");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    @Override
    public final void startEngine() {
        System.out.println("Driver started engine");
    }

    @Override
    public final void stopEngine() {
        System.out.println("Driver stopped engine");

    }

    @Override
    public final void drive() {
        System.out.println("Driver is driving the car");
    }
}

