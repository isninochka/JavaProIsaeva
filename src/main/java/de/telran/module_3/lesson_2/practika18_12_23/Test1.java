package de.telran.module_3.lesson_2.practika18_12_23;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Test1 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Q","W","E","R");
        list.forEach(System.out::println);

        List<Integer> list1= new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list1.add(new Random().nextInt(100));
        }
        System.out.println(list1);

            int g = list1.stream()
                    .filter(digit -> digit % 2==0)
                    .map(num -> (num + num)*num*10)
                    .reduce((a,b)->a+b)
                    .get();
            System.out.println(g);
    }
}
