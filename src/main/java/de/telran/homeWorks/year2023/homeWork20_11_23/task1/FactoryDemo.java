package de.telran.homeWorks.year2023.homeWork20_11_23.task1;

public class FactoryDemo {
    public static void main(String[] args) {
        HenFactory factory = new HenFactory();
       factory.getHen("Беларусь");
       factory.getHen("Молдова");
       factory.getHen("Украина");
       factory.getHen("Россия");



    }
}
