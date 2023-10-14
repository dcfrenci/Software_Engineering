package org.esercise.Laboratorio1.Esercizio1;

public class Simulator {
    public static void main(String[] args) {
        Character warrior = new GalacticWarrior(new LaserRifleBehavior(), new MotoMovement());
        warrior.performFight();
        warrior.performMovement();
        Character alien = new Alien(new VenomBlobBehavior(), new Teleport());
        alien.performFight();
        alien.performMovement();
    }
}