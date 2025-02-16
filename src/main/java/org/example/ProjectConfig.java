package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProjectConfig {

    @Bean
    public Engine engine() {
        return new Engine(465);
    }
    @Bean
    @Primary
    public Engine engine1() {
        return new Engine(743);
    }

    @Bean
    public Driver driver() {
        return new Driver("Alex");
    }

    @Bean
    public TypeCar typeCar() {
        return new TypeCar("Automatic");
    }

    @Bean
    @Primary
    public Car car(Engine engine, Driver driver, TypeCar typeCar) {
        return new Car("Tesla", engine, driver, typeCar);
    }
    @Bean
    public Car car1(Engine engine, Driver driver, TypeCar typeCar) {
        return new Car("BMW", engine, driver, typeCar);
    }
}
