package org.esercise.Laboratorio3.Esercizio1;

public class UScarFactory extends CarFactory {
    @Override
    public Car orderCar(String type) {
        if (type.equals("Dodge Viper")) {
            return new DodgeViper();
        }
        return null;
    }
}
