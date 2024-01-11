package de.telran.homeWorks.year2023.homeWork29_11_23.task2.taski_b;
//Перебрать ArrayList и найти наименьший элемент.
//        Перебрать LinkedList и найти наибольший элемент.
//        Перебрать ArrayList и найти количество элементов, начинающихся с определенной буквы.
//        Перебрать LinkedList и найти первое вхождение определенной строки.
//        Создать LinkedList с объектами вашего собственного класса и удалить все элементы, удовлетворяющие определенному условию.

import java.util.ArrayList;
import java.util.HashSet;


public class taski_b_1 {
    //Перебрать ArrayList и найти наименьший элемент.
    public static void main(String[] args) {


    ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("No");
        stringArrayList.add("Yes");
        stringArrayList.add("Tree");
        stringArrayList.add("Four");
        stringArrayList.add("Five");
        stringArrayList.add("Sex");
    String minEl1 = stringArrayList.get(0);
        for (String iterator:stringArrayList) {
            if (minEl1.length()<iterator.length()){
                minEl1 = stringArrayList.get(0);
            }else {
                minEl1 = iterator;
            }

        }
        System.out.println(minEl1);


        ArrayList<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(3);
        intArrayList.add(1);
        intArrayList.add(6);
        intArrayList.add(8);
        intArrayList.add(4);
        intArrayList.add(-3);
        intArrayList.add(7);

        int minEl = intArrayList.get(0);
        for (Integer integer : intArrayList) {
            if (minEl < integer) {
            } else {
                minEl = integer;
            }
        }
        System.out.println(minEl);

        //Перебрать ArrayList и найти количество элементов, начинающихся с определенной буквы.
        ArrayList<String> stringArrayList2 = new ArrayList<>();
        stringArrayList.add("No");
        stringArrayList.add("Yes");
        stringArrayList.add("Tree");
        stringArrayList.add("Four");
        stringArrayList.add("Five");
        stringArrayList.add("Sex");


}}

