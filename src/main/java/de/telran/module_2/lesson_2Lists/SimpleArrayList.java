package de.telran.module_2.lesson_2Lists;

import java.util.ArrayList;
import java.util.List;

public class SimpleArrayList {
    public static void main(String[] args) {
        List myList = new ArrayList<>();
        myList.add("I'm a string");
        myList.add(1);
        myList.add(true);
        System.out.println(myList);

        List<Integer>myIntList = new ArrayList<>();
        myIntList.add(1);
        myIntList.add(2);
        myIntList.add(5);
        myIntList.add(3);
        System.out.println(myIntList.size());
        System.out.println(myIntList);
        myIntList.add(2,33);
        myIntList.set(1,22);
        System.out.println(myIntList);
        System.out.println(myIntList.get(4));
        System.out.println(myIntList.contains(33));
        System.out.println(myIntList.indexOf(33));
        ArrayList<Integer>myInt2 = new ArrayList<>();
        myInt2.add(6);
        myInt2.add(18);
        myInt2.addAll(myInt2);
        System.out.println(myInt2);


    }

}
