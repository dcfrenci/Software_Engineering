package org.esercise.Laboratorio2.Esercizio2;

public class ComponentFullOptionalInterior extends Car {
    Car car;

    public ComponentFullOptionalInterior(Car car) {
        this.car = car;
    }

    @Override
    public String getDescription() {
        return car.description + ", full optional interior";
    }
}
