package org.esercise.Laboratorio2.Esercizio2;

public class DodgeViper extends Car {
    Car car;
    public DodgeViper() {
        description = "Car description: Dodge Viper";
    }

    @Override
    String getDescription() {
        return description;
    }

    public Car assemble() {
        System.out.println("Assembly the car: Dodge Viper");
        car = new DodgeViper();
        car = new ComponentCarBody(car);
        car = new ComponentBigMotor(car);
        car = new ComponentFullOptionalInterior(car);
        return car;
    }
}
