package org.esercise.Laboratorio2.Esercizio2;

public class ComponentNoOptionalInterior extends Car {
    Car car;

    public ComponentNoOptionalInterior(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.description + ", no optional interior";
    }
}
