package de.telran.praktika;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class praktika_09_02_24 {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(8);
        integerList.add(7);
        integerList.add(-9);
        integerList.add(4);
        integerList.add(-5);
        integerList.add(1);

        System.out.println(integerList);

        integerList.sort(Integer::compareTo);
        System.out.println(integerList);
        System.out.println(integerList.getFirst());
        System.out.println(integerList.get(3));
        integerList
                .forEach(System.out::println);
        int num = 7;
        System.out.println(integerList.contains(num));

        List<String> strings = Arrays.asList("AA","BB","CC");
        String str = "CC";
        System.out.println(strings.contains(str));
        System.out.println(strings.indexOf("BB"));

//        int index = -1;
//
//        for (int i = 0; i < strings.size(); i++) {
//            if(Objects.equals(strings.get(i),str)) {
//                index = i;
//                break;
//            }
//        }
//        System.out.println(index);

        integerList
                .forEach(System.out::println);

        List<Integer> list = integerList.stream()
                .filter(el -> el == num)
                .toList();
        System.out.println(list);

        Long count = integerList.stream()
                .filter(n->n == num)
                .count();
        System.out.println(count);
        AtomicInteger counter = new AtomicInteger(-1);
//        integerList.forEach(n->{
//            if (n == num){
//                index.set(integerList.indexOf(n));
//            }
//        });

        int index = integerList.stream()
                .filter(n -> {
                    counter.getAndIncrement();
                    return n == num;
                })
                .mapToInt(n -> counter.get())
                .findFirst()
                .orElse(-1);
        System.out.println(index);
    }

    
}
