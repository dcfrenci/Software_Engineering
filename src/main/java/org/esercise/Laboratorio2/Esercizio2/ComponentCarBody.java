package org.esercise.Laboratorio2.Esercizio2;

public class ComponentCarBody extends Car {
    Car car;

    public ComponentCarBody(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.description + ", car body";
    }
}
