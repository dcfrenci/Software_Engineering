package org.esercise.Laboratorio3.Esercizio1;

public class EUComponentBody extends CarDecorator {
    @Override
    String getDescription() {
        return car.getDescription() + " EU body";
    }
}
