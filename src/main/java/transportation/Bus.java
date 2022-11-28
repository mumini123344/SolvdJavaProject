package transportation;

import people.Driver;

public class Bus extends Vehicle{
    public Bus(String typeOfVehicle, String engine, String color, String model, String capacity, String fuelType,
               double speed, int wheels, Driver driver) {
        super(typeOfVehicle, engine, color, model, capacity, fuelType, speed, wheels, driver);
    }

    public Bus() {

    }


    public void go(){
        System.out.println("Bus is moving");
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
    public String toString() {
        return super.toString();
    }


}
