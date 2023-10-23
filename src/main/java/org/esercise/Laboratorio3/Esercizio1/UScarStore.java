package org.esercise.Laboratorio3.Esercizio1;

public class UScarStore extends CarStore {
    public UScarStore() {
        carFactory = new UScarFactory();
    }

    @Override
    Car assembleCar(String type) {
        Car car = carFactory.orderCar(type);
        car = new USComponentBody();
        car = new USComponentMotor();
        return car;
    }
}
