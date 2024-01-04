package de.telran.newYearTaski.Egorov;

import java.util.*;
import java.util.stream.Collectors;

public class TaskiEgorovNY {
    public static void main(String[] args) {
        // Задача 1: Подсчет количества уникальных четных и нечетных чисел
        System.out.println("Задача 1: Подсчет количества уникальных четных и нечетных чисел");
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 7, 8, 9, 10, 10, 9, 8, 7, 5, 4, 3, 2, 1);

        long countOdd = numbers.stream()
                .distinct()
                .filter(el->el%2==0)
                .count();

        System.out.println("Odd - "+countOdd);
        long countEven = numbers.stream()
                .distinct()
                .filter(el->el%2!=0)
                .count();
        System.out.println("Even - "+countEven);

        // Задача 2: Группировка строк по первым буквам и вывод первых двух из каждой группы
        System.out.println("Задача 2: Группировка строк по первым буквам и вывод первых двух из каждой группы");
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry", "fig", "grape","ban","bin","doll","dom");
       Map<String,List<String>> groupWords = words.stream()
                .collect(Collectors.groupingBy(s-> String.valueOf(s.charAt(0))));
        System.out.println(groupWords);
        groupWords.values()
                .forEach(g->System.out.println(g.stream()
                    .limit(2)
                    .toList()
        ));
        //Задача 3: Преобразование списков в строку и удаление повторяющихся символов
        System.out.println("Задача 3: Преобразование списков в строку и удаление повторяющихся символов");
        List<List<String>> listOfLists = Arrays.asList(
                Arrays.asList("a", "b", "c","e"),
                Arrays.asList("d", "e", "f"),
                Arrays.asList("g", "h", "i","g")
        );
        List<String> strings = listOfLists.stream()
                .flatMap(Collection::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(strings);





    }
}
