package org.esercise.Laboratorio2.Esercizio2;

public class UsaCarStore extends EuCarStore {
    public Car orderCar(String type) {
        Car car = null;
        if (type.contains("USA")) {
            if (type.contains("Viper")) {
                car = new DodgeViper();
            }
        }
        else {
            super.orderCar(type);
        }
        return car;
    }
}
