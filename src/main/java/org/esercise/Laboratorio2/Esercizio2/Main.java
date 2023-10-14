package org.esercise.Laboratorio2.Esercizio2;

public class Main {
    public static void main(String[] args) {
        CarStore EUcarStore = new EuCarStore();
        Car EUcar = EUcarStore.orderCar("Fiat Panda");
        System.out.println(EUcar.getDescription());

        CarStore UScarStore = new UsaCarStore();
        Car UScar = UScarStore.orderCar("Dodge Viper");
        System.out.println(UScar.getDescription());
    }
}
