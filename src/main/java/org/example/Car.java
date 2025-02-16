package org.example;

public class Car {
    private String brand;
    private Engine engine;
    private Driver driver;
    private TypeCar typeCar;

    public Car(String brand, Engine engine, Driver driver, TypeCar typeCar) {
        this.brand = brand;
        this.engine = engine;
        this.driver = driver;
        this.typeCar = typeCar;
    }

    public String getBrand() {
        return brand;
    }
    public Engine getEngine() {
        return engine;
    }
    public Driver getDriver() {
        return driver;
    }
    public TypeCar getTypeCar() {
        return typeCar;
    }
}
