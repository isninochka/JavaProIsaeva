package de.telran.module_1.summary;

public class SimpleFruit {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setSugar(16);
        fruit.setVitamins(new String[]{"A","C"});
        fruit.setColor("Weit");

        System.out.println(fruit);

        Ananas ananas = new Ananas();

        ananas.setSugar(16);
        ananas.setVitamins(new String[]{"A","B","C"});
        ananas.setColor("Yellow");
        ananas.setCountry("Ecuador");
        ananas.constVal = "I'm constant";


        System.out.println(ananas);





    }





}
