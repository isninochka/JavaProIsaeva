package de.telran.homeWorks.homeWork17_11_23.task_3;

public class Pizzeria {
    public static void main(String[] args) {

        PizzeriaEmployees employees = new PizzeriaEmployees();

        Cachier cachier = employees;
        cachier.sumInvoice(130);

        Garson garson = employees;
        garson.bringOrder("Pizza-Margaritta");

        Cleaner cleaner = employees;
        cleaner.cleanTable();

        Cook cook = employees;
        cook.cooking("Pizza-4Cheese");








    }
}
