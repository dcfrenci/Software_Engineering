package org.esercise.Laboratorio2.Esercizio2;

public class ComponentSmallMotor extends Car {
    Car car;

    public ComponentSmallMotor(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.getDescription() + ", small motor";
    }
}
