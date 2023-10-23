package org.esercise.Laboratorio3.Esercizio1;

public class EUcarFactory extends CarFactory {
    @Override
    public Car orderCar(String type) {
        if (type.equals("Fiat Panda")) {
            return new FiatPanda();
        }
        return null;
    }
}
