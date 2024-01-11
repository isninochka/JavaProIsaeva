package de.telran.homeWorks.year2023.homeWork20_12_23;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Task1_2_3 {


    public static void main(String[] args) {
        //   1. Дан лист строк "BigBen", "BigBob", "Big", "Ben", "Big Bob".
        //    Сколько раз объект «Big» встречается в коллекции?

        List<String> words = Arrays.asList("BigBen", "BigBob", "Big", "Ben", "Big Bob");

        long c = words.stream()
                .filter(el -> el.equals("Big"))
                .count();
        System.out.println(c);

        // 2. Найти самый маленький элемент: Arrays.asList("a1", "b5", "a2", "b4")

        List<String> list1 = Arrays.asList("a1", "b5", "a2", "b4");
        Optional<String>minEl = list1.stream()
                .min(Comparator.comparing(String::valueOf));
        System.out.println(minEl);

        // 3. Выполнить сортировку в обратном алфавитном порядке и удалить дубликаты.
        //Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");

        List<String> list2 = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
        List<String>reversList2 = list2.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(reversList2);











    }
}
