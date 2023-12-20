package de.telran.module_3.lesson_2.lesson_3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStream {
    public static void main(String[] args) {


    List<String> list = Arrays.asList("10","20","1","10","15","50","25");
        System.out.println(list);
        System.out.println();


        //filter&count
        long c = list.stream()
                .filter(p->p.equals("10"))
                .count();
        System.out.println("count = " + c);

       //sorted
        List<String>sortList = list.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortList);

        sortList = list.stream()
                //.sorted(String::compareTo)
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(sortList);

        sortList = list.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .toList();
        System.out.println(sortList);

        //Skip
        Stream<String> stream1 = list.stream();
        Stream<String> stream2 = stream1.sorted().skip(2);
        sortList = stream2.toList();
        System.out.println(sortList);

        sortList = list.stream()
                .sorted()
                .skip(3)
                .toList();
        System.out.println(sortList);

        // distinct
        Set<String> setResult= list.stream()
                .distinct()
                .collect(Collectors.toSet());
        System.out.println(setResult);

        //peek
        sortList = list.stream()
                .peek(System.out::println)
                .toList();
        System.out.println(sortList);

        //map
        list.stream()
                .map(x-> x+" minute")
                .forEach(System.out::println);

        //map another type
        list.stream()
                //.map(x->Integer.parseInt(x))
                .mapToInt(Integer::parseInt)
                .forEach(System.out::println);

        //flatMap
        ArrayList<List<Integer>> arrayList = new ArrayList<>();
        List list1 = List.of(1,2,3);
        List list2 = List.of(4,5,6);

        arrayList.add(list1);
        arrayList.add(list2);

        int min = arrayList.stream()
                .flatMap(x-> x.stream())
                .peek(System.out::println)
                .min(Integer::compareTo).get();
        System.out.println(min);

    }
}
