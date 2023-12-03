package de.telran.homeWorks.homeWork29_11_23.task2.taski_b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class taski_b_1 {
    //Перебрать ArrayList и найти наименьший элемент.
    public static void main(String[] args) {

//
//    ArrayList<String> stringArrayList = new ArrayList<>();
//    String minEl = "";
//        for (String iterator:stringArrayList) {
//            if (iterator.length() < minEl.length()){
//                System.out.println(iterator);
//            }
//
//        }
        ArrayList<Integer> intArrayList = new ArrayList<>();
        intArrayList.add(3);
        intArrayList.add(1);
        intArrayList.add(6);
        intArrayList.add(8);
        intArrayList.add(4);
        intArrayList.add(0);
        intArrayList.add(7);

        for (Integer integer : intArrayList) {
            if (intArrayList.get(0) < integer) {

                System.out.println(intArrayList.get(0));
            } else {
                System.out.println(integer);
            }


        }




    }
    }

