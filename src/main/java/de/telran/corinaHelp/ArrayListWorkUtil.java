package de.telran.corinaHelp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Методы оформить в отдельном классе ArrayListWorkUtil,
В основном классе программы, создавать необходимые списки, вызывать необходимые методы и класса выше и
выводить результат в консоль*/
public class ArrayListWorkUtil {
    //1.Написать метод, который примет список значений String и вернет одну строку, которая представляет собой
    //конкатенацию (объединение) всех значений.
    public static String concatenateStrings(List<String> strings){
        StringBuilder concStrings = new StringBuilder();
        for (String str : strings){
            concStrings.append(str);

        }
        return concStrings.toString();
    }
//2.Написать метод, который примет список значений int и вернет их максимум или минимум
    public static int findMaxOrMin(List<Integer> numbers, boolean isMax){
        int findNumber = numbers.getFirst();
           for (int i = 1; i < numbers.size(); i++) {
               int number = numbers.get(i);
            if(isMax && number > findNumber) {
                findNumber = number;
            }else if (!isMax && number < findNumber) {
                findNumber = number;
            }
        }
        return findNumber;
    }
    //3.Написать метод, который примет список значений String, и вернет максимальную длину строки в этом списке
    public static int maxLengthString(List<String> strings){
        int maxLength = 0;
        for (String str:strings){
            if(str.length()>maxLength){
                maxLength = str.length();
            }
        }
        return maxLength;
    }
    //4.Написать метод, который примет список значений String, дополнительный параметр длину, и вернет список со
    //всеми значениями String переданной длины
    public static List<String> findLengthString(List<String> strings, int length){
        List<String> findStrings = new ArrayList<>();
        for (String str: strings){
            if(str.length() == length){
                findStrings.add(str);
            }
        }
        return findStrings;
    }

    //5.Написать метод, который примет список значений int и вернет список, содержащий только нечетные числа
    public static List<Integer> oddNumbers(List<Integer> numbers){
        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer num: numbers){
            if(num % 2 != 0){
                oddNumbers.add(num);
            }
        }
        return oddNumbers;
    }

    //6.Написать метод, который примет список значений String, и вернет список этих значений без каких-либо
    //дубликатов.

    public static List<String> deleteDublicate(List<String> strings){
        List<String> uniqueStrings = new ArrayList<>();
        for (String str: strings){
            if(!uniqueStrings.contains(str)){
                uniqueStrings.add(str);
            }
        }
        return uniqueStrings;
    }
}

class Main{
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("QA","помогают","программистам","тестировать","программы");
        List<String> strings1 = Arrays.asList("AA","BB","CC","AA","DD","AA","BB");
        List<Integer> numbers = Arrays.asList(2,15,24,19,11,33,26,22);

        System.out.println("Конкатенация строк ->" +ArrayListWorkUtil.concatenateStrings(strings));
        System.out.println("Максимальное значение ->"+ArrayListWorkUtil.findMaxOrMin(numbers, true));
        System.out.println("Минимальное значение ->"+ArrayListWorkUtil.findMaxOrMin(numbers,false));
        System.out.println("Максимальная длинна строки ->" +ArrayListWorkUtil.maxLengthString(strings));
        System.out.println("Данную длину имеет слово ->"+ArrayListWorkUtil.findLengthString(strings,9));
        System.out.println("Список нечетных чисел ->"+ArrayListWorkUtil.oddNumbers(numbers));
        System.out.println("Список без дубликатов ->"+ArrayListWorkUtil.deleteDublicate(strings1));








    }
}
