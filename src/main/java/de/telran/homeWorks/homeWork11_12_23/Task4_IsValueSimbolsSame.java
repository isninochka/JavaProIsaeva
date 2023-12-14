package de.telran.homeWorks.homeWork11_12_23;

import java.util.*;

//Сгруппируйте слова с одинаковым набором символов
//        Дан список слов со строчными буквами. Реализуйте функцию поиска всех слов с одинаковым уникальным набором символов.
//        вход: String words[] = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf"};
//        Выход:
//        student, students,
//        cat, act,
//        dog, god,
//        flow, wolf
public class Task4_IsValueSimbolsSame {
    public static void main(String[] args) {
        String words[] = {"student", "students", "dog", "god", "cat", "act", "flow", "wolf"};
        Map<String, List<String>> groupedWords = Method.groupWords(words);

        for (List<String> group : groupedWords.values()) {
            System.out.println(group + " ");
        }
    }
}
class Method{
    public static Map<String, List<String>> groupWords(String[] words) {
        Map<String, List<String>> wordMap = new HashMap<>();

        for (String word : words) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            List<String> group = wordMap.getOrDefault(sortedWord, new ArrayList<>());
            group.add(word);
            wordMap.put(sortedWord, group);
        }

        return wordMap;
    }
}

