package org.esercise.Laboratorio3.Esercizio1;

public class EUComponentMotor extends CarDecorator {

    @Override
    String getDescription() {
        return car.getDescription() + " EU motor";
    }
}
