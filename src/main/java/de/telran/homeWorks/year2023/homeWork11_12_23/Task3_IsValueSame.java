package de.telran.homeWorks.year2023.homeWork11_12_23;
//Проверьте, равны ли два массива или нет с точки зрения набора хранимых значений.
//        Не обязательно индексы равных элементов должны совпадать.

import java.util.Arrays;
public class Task3_IsValueSame {
    public static void main(String[] args) {
        String[] numbers1 = {"One","Two","Three","Four","Five"};
        String[] numbers2 = {"Two","Four","Five","Tree","One"};

        if(Arrays.equals(numbers1,numbers2)){
                System.out.println("Same");
            } else System.out.println("Not Same");
    }
}
