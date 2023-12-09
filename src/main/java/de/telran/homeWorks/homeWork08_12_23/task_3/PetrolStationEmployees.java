package de.telran.homeWorks.homeWork08_12_23.task_3;

public class PetrolStationEmployees implements Refueller, Cashier {

    @Override
    public void refuelingCar() {
        System.out.println("Заправляю автомобиль ");
    }

    @Override
    public void takeMoney() {
        System.out.println("Принимаю оплату за бензин");
    }
}
 interface Refueller{
    void refuelingCar();
 }
 interface Cashier{
    void takeMoney();
 }