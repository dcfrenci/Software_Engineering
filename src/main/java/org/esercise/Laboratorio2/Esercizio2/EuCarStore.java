package org.esercise.Laboratorio2.Esercizio2;

public class EuCarStore {
    public Car orderCar(String type) {
        Car car = new Car();
        if (type.contains("EU")) {
            if (type.contains("Panda")) {
                System.out.println("Creating a FiatPanda");
                car = new FiatPanda();
            }
        }
        return car;
    }
}
