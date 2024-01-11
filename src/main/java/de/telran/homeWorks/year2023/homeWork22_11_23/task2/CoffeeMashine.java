package de.telran.homeWorks.year2023.homeWork22_11_23.task2;

public class CoffeeMashine {
    private static final CoffeeMashine COFFE_MASHINE = new CoffeeMashine();
    private CoffeeMashine(){
    }

    public static CoffeeMashine getCoffeeMashine(String coffeeType){
        return COFFE_MASHINE;
    }



}
