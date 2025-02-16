package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Car car = context.getBean(Car.class);

        System.out.println("Car Brand: " + car.getBrand());
        System.out.println("Engine Horsepower: " + car.getEngine().getHorsepower());
        System.out.println("Driver Name: " + car.getDriver().getName());
        System.out.println("Type Car: " + car.getTypeCar().getType());

        context.close();
    }
}
