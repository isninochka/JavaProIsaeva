package de.telran.algoritmus.lesson2_12_12_23;

import java.util.Arrays;

public class lesson2_12_12_23 {
    public static void main(String[] args) {

        int[] array = {5, 4, 3, 2, 1};


        boolean notSorted = true;
        //Пример сортировки пузырьком
//    while (notSorted)   {
//        System.out.println(notSorted);
//        System.out.println(Arrays.toString(array));
//
//        notSorted = false;
//
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 0; j < array.length - 1; j++) {
//                if (array[j] > array[j + 1]) {
//                    int temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                }
//            }
//            System.out.println(Arrays.toString((array)));
//        }
//    }
        while (notSorted)   {
            System.out.println(notSorted);
            System.out.println(Arrays.toString(array));

            notSorted = false;

            for (int i= 0; i < array.length-1 ; i++) {
                for (int j = array.length-2; j >= 0 ; j--) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
                System.out.println(Arrays.toString((array)));
            }
        }
    }

}
