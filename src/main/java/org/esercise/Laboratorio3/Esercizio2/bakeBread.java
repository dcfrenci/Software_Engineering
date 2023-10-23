package org.esercise.Laboratorio3.Esercizio2;

public class bakeBread implements Command {
    boolean cooked;

    public bakeBread() {
        this.cooked = false;
    }

    @Override
    public void excute() {
        this.cooked = true;
    }
}
