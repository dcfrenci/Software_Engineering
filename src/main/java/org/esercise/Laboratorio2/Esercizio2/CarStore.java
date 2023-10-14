package org.esercise.Laboratorio2.Esercizio2;

public class CarStore extends Car{
    UsaCarStore factory;

    public CarStore() {
        this.factory = new UsaCarStore();
    }

    //abstract Car orderCar(String type);
    public Car order(String type) {
        Car car;
        car = factory.orderCar(type);
        return car;
    }
}
