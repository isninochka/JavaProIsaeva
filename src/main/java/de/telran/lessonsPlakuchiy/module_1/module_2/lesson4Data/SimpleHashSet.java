package de.telran.lessonsPlakuchiy.module_1.module_2.lesson4Data;

import java.util.*;

public class SimpleHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(2);
        set.add(1);
        set.add(6);
        set.add(8);
        set.add(12);
        set.add(3);
        System.out.println(set);

        System.out.println();
        Set<Integer> setLink = new LinkedHashSet<>();

        setLink.add(5);
        setLink.add(2);
        setLink.add(1);
        setLink.add(6);
        setLink.add(8);
        setLink.add(12);
        setLink.add(3);
        System.out.println(setLink);
        int h = Integer.MAX_VALUE;
        System.out.println(h);
        h = h+1;
        System.out.println(h);
        h =Integer.MIN_VALUE;
        System.out.println(h);
        System.out.println(h-1);

        Set<Cat> cats = new HashSet<>();
        cats.add(new Cat("Murka", "Pers",2));
        cats.add(new Cat("Barsic", "British",5));
        cats.add(new Cat("Rich", "MeinCoon",7));
        cats.add(new Cat("Dasha", "Mix",3));
        System.out.println(cats);

        cats.add(new Cat("Barsic", "British",6));
        System.out.println(cats);

//        SortedSet<Cat> catsTree = new TreeSet<>();
//        catsTree .add(new Cat("Murka", "Pers",2));
//        catsTree .add(new Cat("Barsic", "British",5));
//        catsTree .add(new Cat("Rich", "MeinCoon",7));
//        catsTree .add(new Cat("Dasha", "Mix",3));
//        System.out.println(catsTree ); не работает без компоратора, нет данных как сортировать

        Set<Cat> catsList = new LinkedHashSet<>();
        catsList.add(new Cat("Murka", "Pers",2));
        catsList.add(new Cat("Barsic", "British",5));
        catsList.add(new Cat("Rich", "MeinCoon",7));
        catsList.add(new Cat("Dasha", "Mix",3));
        System.out.println(catsList);

        Iterator<Cat>iterator = catsList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
            for (Cat cat : catsList) {
             System.out.println(cat);

            }
        }
    }
}
