package de.telran.homeWorks.homeWork17_11_23.task_3;

public class PizzeriaEmployees implements Cachier,Cook,Cleaner,Garson{
    @Override
    public void sumInvoice(double sum) {
        Cachier.super.sumInvoice(sum);
    }

    @Override
    public void acceptPay(double sum) {
        Cachier.super.acceptPay(sum);
    }

    @Override
    public void cleanTable() {
        Cleaner.super.cleanTable();
    }

    @Override
    public void cooking(String dish) {
        Cook.super.cooking(dish);
    }

    @Override
    public void order(String dish) {
        Garson.super.order(dish);
    }

    @Override
    public void bringOrder(String dish) {
        Cook.super.bringOrder(dish);
    }

    @Override
    public void washesDishes() {
        Cook.super.washesDishes();
    }
}
