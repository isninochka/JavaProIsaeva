package de.telran.module_2.lesson6_StringSort.Praktika;

import de.telran.module_2.lesson4Data.Cat;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class task1 {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Murka", "Pers",2));
        cats.add(new Cat("Barsic", "British",5));
        cats.add(new Cat("Rich", "MeinCoon",7));
        cats.add(new Cat("Dasha", "Mix",3));
        cats.add(new Cat("Vasia", "Sfinks",7));
        cats.add(new Cat("Murka", "Skotish",5));
        System.out.println(cats);

        cats.sort(Comparator.comparing(Cat::getAge).thenComparing(Cat::getName));
        System.out.println(cats);

//        public int compare(Cat o1, Cat o2) {
//            int res = Integer.compare(o1.getAge(), o2.getAge());
//            if (res != 0)
//                return res;
//            else
//                return o1.getName().compareTo(o2.getName());
//        }
    }
}
