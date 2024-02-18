package de.telran.lessonsPlakuchiy.module_1.module_2.lesson_2Lists;

import java.util.LinkedList;
import java.util.List;

public class SimpleLinkedList {
    public static void main(String[] args) {


        List<String> myStringList = new LinkedList<>();
        myStringList.add("January");
        myStringList.add("February");
        myStringList.add("Marz");
        System.out.println(myStringList);

        for (String s: myStringList) {
            System.out.println(s+",");
            s=s+"!";
        }
        System.out.println(myStringList);

        for (int i = 0; i < myStringList.size(); i++) {
            String s = myStringList.get(i);
            myStringList.set(i, s+"!");
        }
        System.out.println(myStringList);

        myStringList.addFirst("December");
        myStringList.addLast("December");

        System.out.println(myStringList);





    }
}