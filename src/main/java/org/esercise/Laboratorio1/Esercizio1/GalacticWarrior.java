package org.esercise.Laboratorio1.Esercizio1;

public class GalacticWarrior extends Character{

    public GalacticWarrior(FightBehavior fightBehavior, MovementBehavior movementBehavior) {
        super(fightBehavior, movementBehavior);
    }

    @Override
    public void display() {
        System.out.println("I'm a galactic warrior!!");
    }
}
