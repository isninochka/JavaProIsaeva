package de.telran.module_4.lesson08_01_24;

import java.util.ArrayList;
import java.util.List;

public class Generiki {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add("I like Java");
        list.add(5);
        list.add(5.5);
        String text = list.get(0)+" and generics!";
        System.out.println(text);
        String text1 = (String) list.get(0);
        System.out.println(text1);
        System.out.println(list);
        ((String) list.get(0)).contains("i");
    }
}
