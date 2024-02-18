package de.telran.lessonsPlakuchiy.module_1.module_2.lesson4Data;

import java.util.SortedSet;
import java.util.TreeSet;

public class SimpleTreeSet {
    public static void main(String[] args) {

        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("T");
        sortedSet.add("V");
        sortedSet.add("A");
        sortedSet.add("B");
        sortedSet.add("D");
        System.out.println(sortedSet);

        System.out.println(sortedSet.add("A"));
        System.out.println(sortedSet);

    }

}
