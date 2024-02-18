package de.telran.lessonsPlakuchiy.module_1.module_2.lesson4Data;

public class SimpleData {
    //POJO CLASS
    public static void main(String[] args) {
        Cat cat1 = new Cat("Murka", "Mein Koon",2);
        Cat cat2 = cat1;
        System.out.println(cat1 == cat2);
        System.out.println(cat1.equals(cat2));

        Cat cat3 = new Cat("Murka", "Mein Koon",2);
        System.out.println(cat1 == cat3);
        System.out.println(cat1.equals(cat3));
        System.out.println(cat1.getClass());
        Object obj = cat1;
        System.out.println(obj.getClass());

    }

}
