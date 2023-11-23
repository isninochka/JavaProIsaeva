package de.telran.module_1.lessons.lesson3.statics;

public class Simple {
    public static void main(String[] args) {


    Cat cat1 = new Cat("Murka");


        System.out.println(cat1.name +"->"+ cat1.countCats);
        Cat cat2 = new Cat("Barsik");

        System.out.println(cat2.name +"->"+ cat2.countCats);
        System.out.println(Cat.countCats);

        cat1.setAge(2);

}
}