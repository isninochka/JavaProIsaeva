package de.telran.module_2.lesson3Iterrators;

import java.util.List;
import java.util.ListIterator;

public class SimpleListIterator {
    public static void main(String[] args) {
        List<Integer> intLists = List.of(1,7,3,5,9,2,3,4);
        System.out.println(intLists);
        ListIterator<Integer>listIterator = intLists.listIterator();

        while (listIterator.hasNext()){
            int el = listIterator.next();

            System.out.println(el);
        }

        System.out.println();
        while (listIterator.hasPrevious()){
            int el =listIterator.previous();

            System.out.println(el);
        }

    }
}
