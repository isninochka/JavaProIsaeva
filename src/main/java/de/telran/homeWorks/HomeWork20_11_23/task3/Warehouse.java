package de.telran.homeWorks.HomeWork20_11_23.task3;

public class Warehouse implements Assembler, Keeper, Loader  {


    @Override
    public void placesProducts() {
        System.out.println("Товар размещен на складе");

    }

    @Override
    public void collectProducts() {
        System.out.println("Товар собран");

    }

    @Override
    public void acceptsProducts() {
        System.out.println("Товар принят");

    }

    @Override
    public void releasesProducts() {
        System.out.println("Товар отпущен");

    }

    @Override
    public void findPlace() {
        System.out.println("Для данного товара определена ячейка");

    }

    @Override
    public void generateTaskForAssemblyTask() {
        System.out.println("Задание по сборке товара создано");

    }

    @Override
    public void generateTaskForPlacement() {
        System.out.println("Задание по размещению товара создано");

    }

    @Override
    public void unloadsProducts() {
        System.out.println("Товар разгружен");

    }

    @Override
    public void loadsProducts() {
        System.out.println("Товар загружен");

    }
}
