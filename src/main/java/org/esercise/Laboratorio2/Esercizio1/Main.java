package org.esercise.Laboratorio2.Esercizio1;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Notebook();
        System.out.println(computer.getDescription() + ", euro: " + computer.cost());
        computer = new GPU(computer);
        computer = new CPU(computer);
        System.out.println(computer.getDescription() + ", euro: " + computer.cost());
    }
}
