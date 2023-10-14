package org.esercise.Laboratorio1.Esercizio1;

public abstract class Character {
    FightBehavior fightBehavior;
    MovementBehavior movementBehavior;

    public Character(FightBehavior fightBehavior, MovementBehavior movementBehavior) {
        this.fightBehavior = fightBehavior;
        this.movementBehavior = movementBehavior;
    }
    public void performFight() {
        fightBehavior.fight();
    }
    public void performMovement() {
        movementBehavior.pilot();
    }
    public abstract void display();
}
