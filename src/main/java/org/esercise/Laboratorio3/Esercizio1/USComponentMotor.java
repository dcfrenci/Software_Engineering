package org.esercise.Laboratorio3.Esercizio1;

public class USComponentMotor extends CarDecorator {
    @Override
    String getDescription() {
        return car.getDescription() + " US motor,";
    }
}
