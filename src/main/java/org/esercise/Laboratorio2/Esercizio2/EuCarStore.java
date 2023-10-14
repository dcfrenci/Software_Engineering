package org.esercise.Laboratorio2.Esercizio2;

public class EuCarStore extends CarStore {
    @Override
    Car orderCar(String type) {
        if (type.contains("Fiat Panda")) {
            FiatPanda car = new FiatPanda();
            return car.assemble();
        }
        return null;
    }
}
