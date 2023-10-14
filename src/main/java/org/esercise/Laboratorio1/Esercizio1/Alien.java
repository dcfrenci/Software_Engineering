package org.esercise.Laboratorio1.Esercizio1;

public class Alien extends Character{
    public Alien(FightBehavior fightBehavior, MovementBehavior movementBehavior) {
        super(fightBehavior, movementBehavior);
    }

    @Override
    public void display() {
        System.out.println("I'm an alien!!");
    }
}
