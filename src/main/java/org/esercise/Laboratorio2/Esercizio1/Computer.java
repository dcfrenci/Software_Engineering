package org.esercise.Laboratorio2.Esercizio1;

public abstract class Computer {
    String description = "Unknown computer";
    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
