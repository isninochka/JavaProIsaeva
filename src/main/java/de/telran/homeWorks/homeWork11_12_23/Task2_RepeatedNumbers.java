package de.telran.homeWorks.homeWork11_12_23;

import java.util.HashMap;
import java.util.Map;


//Найти первый элемент, встречающийся k раз в массиве
public class Task2_RepeatedNumbers {

    public static void main(String[] args) {
        Map<Integer, String> numbers = new HashMap<>();
        numbers.put(1, "One");
        numbers.put(2, "Two");
        numbers.put(3, "Three");
        numbers.put(4, "Four");
        numbers.put(7, "Two");
        numbers.put(6, "Three");
        numbers.put(5, "Two");

        System.out.println(numbers);
        System.out.println("_________________");

        Map<String, Integer> repeatedNumbers =new HashMap<>();
        for (Map.Entry<Integer,String> entry:numbers.entrySet()) {
            if (repeatedNumbers.containsKey(entry.getValue())) {
                repeatedNumbers.put(entry.getValue(), repeatedNumbers.get(entry.getValue())+1);
            } else {
                repeatedNumbers.put(entry.getValue(), 1);
            }
            System.out.println(repeatedNumbers);
        }
        System.out.println("Repeated numbers____________");
        for (Map.Entry<String,Integer> entry:repeatedNumbers.entrySet()) {
            if(entry.getValue() >= 2)
                System.out.println(entry);
        }

    }

}
