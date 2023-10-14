package org.esercise.Laboratorio2.Esercizio2;

public class FiatPanda extends Car {
    Car car;
    public FiatPanda() {
        description = "Car: FiatPanda";
    }
    public Car assemble() {
        car = new ComponentCarBody(car);
        car = new ComponentSmallMotor(car);
        car = new ComponentNoOptionalInterior(car);
        return car;
    }
}
