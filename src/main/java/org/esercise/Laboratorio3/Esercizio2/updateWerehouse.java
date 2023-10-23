package org.esercise.Laboratorio3.Esercizio2;

public class updateWerehouse implements Command {
    int numberOfNoteBook;

    public updateWerehouse(int numberOfNoteBook) {
        this.numberOfNoteBook = numberOfNoteBook;
    }

    @Override
    public void excute() {
        this.numberOfNoteBook--;
    }
}
