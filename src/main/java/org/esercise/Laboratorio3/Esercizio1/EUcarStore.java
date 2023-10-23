package org.esercise.Laboratorio3.Esercizio1;

public class EUcarStore extends CarStore {
    public EUcarStore() {
        carFactory = new EUcarFactory();
    }

    @Override
    Car assembleCar(String type) {
        Car car = carFactory.orderCar(type);
        car = new EUComponentBody();
        car = new EUComponentMotor();
        return car;
    }
}
