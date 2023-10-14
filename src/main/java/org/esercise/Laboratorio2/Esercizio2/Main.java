package org.esercise.Laboratorio2.Esercizio2;

public class Main {
    public static void main(String[] args) {
        CarStore carStore = new CarStore();
        Car car = carStore.order("EU Panda");
        System.out.println(car.getDescription());
    }
}
