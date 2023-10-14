package org.esercise.Laboratorio2.Esercizio2;

public class FiatPanda extends Car {
    Car car;
    public FiatPanda() {
        description = "Car description: FiatPanda";
    }

    @Override
    String getDescription() {
        return description;
    }

    public Car assemble() {
        System.out.println("Assembly the car: Fiat Panda");
        car = new FiatPanda();
        car = new ComponentCarBody(car);
        car = new ComponentSmallMotor(car);
        car = new ComponentNoOptionalInterior(car);
        return car;
    }
}
