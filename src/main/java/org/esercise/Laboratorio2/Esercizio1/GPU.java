package org.esercise.Laboratorio2.Esercizio1;

public class GPU extends PartDecorator {
    Computer computer;

    public GPU(Computer computer) {
        this.computer = computer;
    }

    public double cost() {
        return computer.cost() + 150;
    }
    @Override
    public String getDescription() {
        return computer.getDescription() + ", better GPU";
    }
}
