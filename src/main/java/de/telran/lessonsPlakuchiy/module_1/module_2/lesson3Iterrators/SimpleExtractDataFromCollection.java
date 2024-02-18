package de.telran.lessonsPlakuchiy.module_1.module_2.lesson3Iterrators;

import java.util.Iterator;
import java.util.List;

public class SimpleExtractDataFromCollection {
    public static void main(String[] args) {


    List<Integer> intList = List.of(1,7,3,6,2,5,9);

        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
            }
        System.out.println();

        for (int el:intList) {
            System.out.println(el);
            }
        System.out.println();

        intList.stream().forEach(o -> System.out.println(o));
        System.out.println();
        intList.forEach(o -> System.out.println(o));
        intList.forEach(System.out::println);

        System.out.println();

        Iterator<Integer> iterator = intList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

}
}