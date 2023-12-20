package de.telran.module_3.lesson_2.lesson_3.praktica;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;


//        Задача 9: Подсчет суммы значений объектов.
//        List<Person> task9Input = Arrays.asList(
//        new Person("Alice", 25),
//        new Person("Bob", 30),
//        new Person("Charlie", 35));
public class Mik {
    public static void main(String[] args) {
        List<String>list = List.of("Mama","Mila","Ramu");
        list.stream()
                .map( el ->{
                    if (el.startsWith("M"))
                        System.out.println("***********");
                    //не будет работать, так как нет терминального оператора
                return  el.toLowerCase();});

       // Задача 1: Собрать элементы потока в список.


        List<Integer> intList = Stream.of(1,19,5,8,4,2,9)
                .toList();
        System.out.println(intList);

//        Задача 2: Удалить дубликаты из списка и собрать их в множество.
//                List<String> task2Input = Arrays.asList("A", "B", "A", "C");

        List<String> task2Input = Arrays.asList("A", "B", "A", "C");
        task2Input.stream()
                .distinct()
                .collect(Collectors.toSet());

//        Задача 4: Подсчет повторяющихся элементов и создание мапа.
//        List<String> task4Input = Arrays.asList("A", "B", "A", "C", "B", "A");

        List<String> task4Input = Arrays.asList("A", "B", "A", "C", "B", "A");
        Map<String, Integer> mapZTask4 = task4Input.stream()
                .collect(Collectors.toMap(key->key, value -> 1, Integer::sum));
        System.out.println(mapZTask4);


//        Задача 5: Собрать только уникальные элементы в список.
//        List<String> task5Input = Arrays.asList("A", "B", "A", "C", "B", "D");

        List<String> task5Input = Arrays.asList("A", "B", "A", "C", "B", "D");
        Set<String> setTask5 = task5Input.stream()
                .collect(Collectors.toSet());
        System.out.println(setTask5);

//        Задача 6: Объединение элементов в строку с максимальной длиной.
//        String task6 = Stream.of("apple", "banana", "cherry", "date")
        List<String> task6 = Arrays.asList("apple", "banana", "cherry", "date");
        Function<String,String> trim = String::trim;
        String s = trim
                .andThen(StringBuilder::new)
                .andThen(StringBuilder::toString)
                .apply(String.valueOf(task6));
        System.out.println(s);


        // Задача 10: Группировка слов по длине
//        Map<Integer, List<String>> wordsByLength = words.stream()
//                .collect(Collectors.groupingBy(String::length));
//        System.out.println("Words By Length: " + wordsByLength);






    }
}
