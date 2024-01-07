package de.telran.newYearTaski.Egorov;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

        // Задача 4: Фильтрация и умножение числа на 2
        System.out.println("Задача 4: Фильтрация и умножение числа на 2");
        List<Integer> numbers2 = Arrays.asList(1, 3, 2, 6, 4, 5, 7, 8, 9);
        List<Integer> doubleNumbers2 = numbers2.stream()
                .map(n->n*2)
                .toList();
        System.out.println(doubleNumbers2);

        // Задача 5: Разделение чисел на простые и составные
        System.out.println();
        List<Integer> numbers3 = Arrays.asList(2, 3, 4, 5, 67, 8, 9, 10, 11, 12, 13, 14, 15);
        Map<Boolean, List<Integer>> simpleOrCompound = numbers3.stream()
                .collect(Collectors.partitioningBy(n-> isSimpleNumber(n)));
        System.out.println("Simple - "+simpleOrCompound.get(true));
        System.out.println("Compound - "+simpleOrCompound.get(false));

        // Задача 6: Получение уникальных символов из списка строк
        System.out.println("Задача 6: Получение уникальных символов из списка строк");
        List<String> words2 = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> uniqSimbols = words2.stream()
                .map(w-> w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .toList();
        System.out.println(uniqSimbols);

        // Задача 7: Разделение строк на отдельные слова и удаление повторений
        System.out.println("Задача 7: Разделение строк на отдельные слова и удаление повторений");
        List<String> sentences = Arrays.asList("Hello world", "Java is awesome", "Stream API is powerful");
        List<String> uniqWords = sentences.stream()
                .flatMap(w-> Stream.of(w.split(" ")))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqWords);

        // Задача 8: Фильтрация и преобразование строк
        System.out.println("Задача 8: Фильтрация и преобразование строк");
        List<String> words3 = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> newList = words3.stream()
                .filter(w->w.startsWith("c"))
                .map(String::toUpperCase)
                .toList();
        System.out.println(newList);

        // Задача 9: Получение среднего значения чисел
        System.out.println("Задача 9: Получение среднего значения чисел");
        List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 5);
        OptionalDouble average = numbers4.stream()
                .mapToInt(n->n)
                .average();
        System.out.println(average);

        // Задача 10: Получение списка квадратов чисел
        System.out.println("Задача 10: Получение списка квадратов чисел");
        List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer>squerNumbers5 = numbers5.stream()
                .map(n->n*n)
                .toList();
        System.out.println(squerNumbers5);

        // Задача 11: Группировка строк по длине
        System.out.println("Задача 11: Группировка строк по длине");
        List<String> words4 = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        Map<Integer, List<String>> groupWords4 = words4.stream()
                .collect(Collectors.groupingBy(String::length));
        System.out.println(groupWords4);

        // Задача 12: Проверка, содержатся ли строки в списке
        System.out.println("Задача 12: Проверка, содержатся ли строки в списке");
        List<String> words5 =Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        List<String> searchWords = Arrays.asList("banana", "fig", "grape");
        boolean isHearWords = searchWords.stream()
                .allMatch(words5::contains);
        System.out.println(isHearWords);

        // Задача 13: Поиск первой строки, удовлетворяющей условию
        System.out.println("Задача 13: Поиск первой строки, удовлетворяющей условию");
        List<String> words6 = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> searchWord6 = words6.stream()
                .filter(w->w.startsWith("d"))
                .toList();
        System.out.println(searchWord6);

        // Задача 14: Сокращение списка до указанного размера
        System.out.println("Задача 14: Сокращение списка до указанного размера");
        List<Integer> numbers6 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> limNum = numbers6.stream()
                .limit(4)
                .toList();
        System.out.println(limNum);

        // Задача 15: Объединение двух списков в один
        System.out.println("Задача 15: Объединение двух списков в один");
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        Stream.concat(Stream.of(list1),
                        Stream.of(list2))
                .forEach(System.out::print);
















    }
    //Метод для задачи 5
    public static boolean isSimpleNumber(int num) {
        if (num < 2) {
            return false;
        }
        return IntStream.iterate(2, i -> i <= Math.sqrt(num), i -> i + 1).noneMatch(i -> num % i == 0);
    }
}
