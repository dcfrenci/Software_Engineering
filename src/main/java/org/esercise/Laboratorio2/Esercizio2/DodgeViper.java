package org.esercise.Laboratorio2.Esercizio2;

public class DodgeViper extends Car {
    Car car;
    public DodgeViper() {
        description = "Car: DodgeViper";
    }
    public Car assemble() {
        car = new ComponentCarBody(car);
        car = new ComponentBigMotor(car);
        car = new ComponentFullOptionalInterior(car);
        return car;
    }
}
