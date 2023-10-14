package org.esercise.Laboratorio2.Esercizio2;

public class UsaCarStore extends CarStore {
    public Car orderCar(String type) {
        if (type.contains("Dodge Viper")) {
            DodgeViper car = new DodgeViper();
            return car.assemble();
        }
        return null;
    }
}
