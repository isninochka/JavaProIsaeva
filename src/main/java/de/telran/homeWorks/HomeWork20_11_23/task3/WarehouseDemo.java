package de.telran.homeWorks.HomeWork20_11_23.task3;

public class WarehouseDemo {
    public static void main(String[] args) {

    Warehouse warehouse = new Warehouse();

    warehouse.acceptsProducts();
    warehouse.generateTaskForAssemblyTask();
    warehouse.findPlace();
    warehouse.unloadsProducts();
}
}