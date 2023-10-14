package org.esercise.Laboratorio2.Esercizio2;

public class ComponentBigMotor extends Car {
    Car car;

    public ComponentBigMotor(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", big motor";
    }
}
