package de.telran.homeWorks.homeWork22_11_23.task2;

public class CoffeeMashine {
    private static final CoffeeMashine COFFE_MASHINE = new CoffeeMashine();
    private CoffeeMashine(){
    }

    public static CoffeeMashine getCoffeeMashine(String coffeeType){
        System.out.println("Вы готовите "+coffeeType+" в нашей уникальной кофе-машине");
        return COFFE_MASHINE;
    }



}
