package de.telran.module_2.lesson6_StringSort;

import de.telran.module_2.lesson4Data.Cat;

import java.util.*;

public class SimpleCompare {
    public static void main(String[] args) {
        SortedSet<de.telran.module_2.lesson4Data.Cat> catsTree = new TreeSet<>();
        catsTree .add(new Cat("Murka", "Pers",2));
        catsTree .add(new Cat("Barsic", "British",5));
        catsTree .add(new Cat("Rich", "MeinCoon",7));
        catsTree .add(new Cat("Dasha", "Mix",3));
        catsTree .add(new Cat("Vasia", "Sfinks",7));
        System.out.println(catsTree );

        SortedSet<Cat> cats = new TreeSet<>(new NameCatComparator());
        cats.add(new Cat("Murka", "Pers",2));
        cats.add(new Cat("Barsic", "British",5));
        cats.add(new Cat("Rich", "MeinCoon",7));
        cats.add(new Cat("Dasha", "Mix",3));
        cats.add(new Cat("Vasia", "Sfinks",7));
        cats.add(new Cat("Murka", "Skotish",5));
        System.out.println(cats);

        System.out.println();
        List<Cat>catList =new ArrayList<>(cats);
        System.out.println(catList);
        catList.sort(new NameCatComparator());
        System.out.println(catList);

        //Анонимный класс в качестве компоратора

        catList.sort(new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return Integer.compare(o2.getAge(),o1.getAge());
            }
        });
        System.out.println(catList);


        // Анонимный класс, который можно использовать через переменную
        Comparator<Cat>catComparator = new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                return Integer.compare(o1.getAge(),o2.getAge());
            }
        };

        catList.sort(catComparator);
        System.out.println(catList);
        //компоратор через лямда выражения

        Comparator<Cat>catComparator1 =((o1, o2) -> o1.getName().compareTo(o2.getName()));

        catList.sort(catComparator1);
        System.out.println(catList);

        //через компаринг

        Comparator<Cat>catComparator2 =Comparator.comparing(Cat::getAge);

        catList.sort(catComparator2);
        System.out.println(catList);

        catList.sort(Comparator.comparing(Cat::getAge).reversed());
        System.out.println(catList);

        catList.sort(Comparator.comparing(Cat::getAge).thenComparing(Cat::getName).thenComparing(Cat::getBreed));
        System.out.println(catList);

    }

}

class NameCatComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat cat1, Cat cat2) {
        return cat1.getName().compareTo(cat2.getName());
    }
}
