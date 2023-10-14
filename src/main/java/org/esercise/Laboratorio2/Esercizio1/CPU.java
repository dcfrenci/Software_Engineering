package org.esercise.Laboratorio2.Esercizio1;

public class CPU extends PartDecorator {
    Computer computer;

    public CPU(Computer computer) {
        this.computer = computer;
    }

    public double cost() {
        return computer.cost() + 100;
    }
    @Override
    public String getDescription() {
        return computer.getDescription() + ", better CPU";
    }
}
