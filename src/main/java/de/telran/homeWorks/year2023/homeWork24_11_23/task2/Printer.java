package de.telran.homeWorks.year2023.homeWork24_11_23.task2;

public class Printer {
    private static final Printer INSTANCE = new Printer();

    private Printer() {
    }

    public static Printer getInstance(String printerJob){
        System.out.println("You are "+printerJob+" document");
        return INSTANCE;
    }
}
