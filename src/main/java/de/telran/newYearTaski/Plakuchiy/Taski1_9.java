package de.telran.newYearTaski.Plakuchiy;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Taski1_9 {

    public static void main(String[] args) {

        //Задание 1: Фильтрация списка целых чисел на нечетные числа
        List<Integer> numbers = Arrays.asList(3,8,4,5,6,1,9,12,15,19,99,87,66);
        List<Integer>evenNumbers = numbers.stream()
                .filter(n-> n % 2 != 0)
                .toList();
        System.out.println("Задание 1: " + evenNumbers);

        //Задание 2: Преобразование списка строк в список чисел
        List<String> words = Arrays.asList("One","Two","Three","Four","Five", "Six","Seven","Eight","Nine","Ten","Two","Nine","Three");
        List<Integer> wordsLengths = words.stream()
                .map(String::length)
                .toList();
        System.out.println("Задание 2: "+wordsLengths);

        //Задание 3: Суммирование списка чисел
        Optional<Integer> sumNum = numbers.stream()
                .reduce(Integer::sum);
        System.out.println("Задание 3: "+sumNum);

        //Задание 4: Определение максимального значения в списке
        Optional<Integer> maxNum = numbers.stream()
                .max(Integer::compareTo);
        System.out.println("Задание 4: "+maxNum);

        //Задание 5: Фильтрация списка строк на те, которые начинаются с определенной буквы и преобразование их в верхний регистр
        List<String> sortUpperWords = words.stream()
                .filter(w -> w.startsWith("T"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Задание 5: "+sortUpperWords);

        //Задание 6: Получение списка уникальных слов из списка строк, длина которых больше 4 символов
        List<String> words2 = Arrays.asList("One","Two","Three","Four","Five", "Six","Seven","Eight","Nine","Ten","Two","Nine","Three");
        Map<Boolean, List<String>> uniqWords = words2.stream()
                        .collect(Collectors.partitioningBy(el->el.length()>4));
        System.out.println("Задание 6: "+uniqWords.get(true));

        //Задание 7:Преобразование списка объектов класса в список их имен, отсортированных по возрасту ------
        List<Person> personList = Arrays.asList(
                new Person("Sweta",56),
                new Person("Sergey",45),
                new Person("Kostia",80),
                new Person("Andrey",28),
                new Person("Ula",36)
        );
        List<Person> sortedPers = personList.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .collect(Collectors.toList());
        System.out.println("Задание 7: "+sortedPers);

        //Задание 8:Нахождение суммы чисел, кратных 3 и 5, из списка чисел -------
        List<Integer> numbers8 = Arrays.asList(1,8,4,6,5,2,7,9,3,4,8,15,25,19,33);
        Optional<Integer> sumNumbers = numbers8.stream()
                .filter(el->el%5==0 || el%3==0)
                .reduce(Integer::sum);
        System.out.println("Задание 8: "+sumNumbers);

        //Задание 9:Получение списка слов, содержащих только уникальные символы, из списка строк












    }

}
@AllArgsConstructor
@Getter
@ToString
 class Person{
    private String name;
    private Integer age;
 }