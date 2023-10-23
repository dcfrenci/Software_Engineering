package org.esercise.Laboratorio3.Esercizio1;

public class USComponentBody extends CarDecorator {
    @Override
    String getDescription() {
        return car.getDescription() + " US Body,";
    }
}
