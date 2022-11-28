package transportation;



import people.Driver;

import java.util.Objects;

public abstract class Vehicle  {
    private String typeOfVehicle;
    private String engine;
    private String color;
    private String model;
    private String capacity;
    private String fuelType;
    private double maxSpeed;
    private int wheels;
    private Driver driver;

//Constructor
    public Vehicle(String typeOfVehicle, String engine, String color, String model, String capacity, String fuelType,
                   double maxSpeed, int wheels, Driver driver) {
        this.typeOfVehicle = typeOfVehicle;
        this.engine = engine;
        this.color = color;
        this.model = model;
        this.capacity = capacity;
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
        this.wheels = wheels;
        this.driver = driver;
    }

    public Vehicle() {
    }

    public void go() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return Double.compare(vehicle.maxSpeed, maxSpeed) == 0 && getWheels() == vehicle.getWheels()
                && Objects.equals(getTypeOfVehicle(), vehicle.getTypeOfVehicle()) && Objects.equals(getEngine(), vehicle.getEngine())
                && Objects.equals(getColor(), vehicle.getColor()) && Objects.equals(getModel(), vehicle.getModel())
                && Objects.equals(getCapacity(), vehicle.getCapacity()) && Objects.equals(getFuelType(), vehicle.getFuelType())
                && Objects.equals(getDriver(), vehicle.getDriver());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTypeOfVehicle(), getEngine(), getColor(), getModel(), getCapacity(),
                getFuelType(), maxSpeed, getWheels(), getDriver());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "typeOfVehicle='" + typeOfVehicle + '\'' +
                ", engine='" + engine + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", capacity='" + capacity + '\'' +
                ", fuelType='" + fuelType + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", wheels=" + wheels +
                ", driver=" + driver +
                '}';
    }

    //Getters and Setters
    public String getTypeOfVehicle(){
        return typeOfVehicle;
    }
    public void setTypeOfVehicle(String typeOfVehicle){
        this.typeOfVehicle = typeOfVehicle;
    }
    public String getEngine(){
        return engine;
    }
    public void setEngine(String engine){
        this.engine = engine;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getCapacity(){
        return capacity;
    }
    public void setCapacity(String capacity){
        this.capacity = capacity;
    }
    public String getFuelType(){
        return fuelType;
    }
    public void setFuelType(String fuelType){
        this.fuelType = fuelType;
    }
    public double getSpeed(){
        return maxSpeed;
    }
    public void setSpeed(double maxSpeed){
        this.maxSpeed = maxSpeed;
    }
    public int getWheels() {
        return wheels;
    }
    public void setWheels(int wheels) {
        this.wheels = wheels;
    }
    public Driver getDriver() {
        return driver;
    }
    public void setDriver(Driver driver) {
        this.driver = driver;
    }

}

