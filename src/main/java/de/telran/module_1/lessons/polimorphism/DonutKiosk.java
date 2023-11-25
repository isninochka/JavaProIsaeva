package de.telran.module_1.lessons.polimorphism;

public class DonutKiosk {
    public static void main(String[] args) {
        DonutsFactory df = new DonutsFactory();
        df.getInstance(DonutType.CARAMEL).eat();

        df.getInstance(DonutType.CHOCOLATE).eat();
        df.getInstance(DonutType.CHERRY).eat();

    }
}
