package de.telran.homeWorks.year2024.homeWork22_01_24;
import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;

public class SimpleArrays {
    public static void main(String[] args) {
//        int[] arr1 = {1,2,5,5,8,9,7,10};
//        int[] arr2 = {1,0,6,15,6,4,7,0};
//        sameElFinder(arr1,arr2);
//
//        int[] arr3 = {0,3,-2,4,3,2};
//        deleteSameEl(arr3);
//
//        int[]arr4 = {-1, 4, 0, 2, 7, -3};
//        secondMaxEl(arr4);
//
//        secondMinEl(arr4);


    }
//    Напишите программу на Java для поиска общих элементов между двумя массивами целых чисел
//    example input:
//    Array1: [1, 2, 5, 5, 8, 9, 7, 10]
////    Array2: [1, 0, 6, 15, 6, 4, 7, 0]
////    example expected:
//            [1,7]

    public int[] sameElFinder(int[] arr1, int[] arr2){
        int[] sameElArr = new int[0];

        for (int k : arr1) {
            for (int i : arr2) {

                if (k == i) {
                   sameElArr = ArrayUtils.add(arr1, k);

                }
            }
        }
        return sameElArr;
    }

//    Напишите программу на Java для удаления повторяющихся элементов из массива.
//    example input:
//            [0,3,-2,4,3,2]
//    example expected:
//            [0,3,-2,4,2]
    public int[] deleteSameEl(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]==arr[j]){
                    arr = ArrayUtils.remove(arr,i);
                }
            }
        }
        return arr;
    }

//    Напишите программу на Java для поиска второго по величине элемента в массиве.
//    example input:
//            [-1, 4, 0, 2, 7, -3]
//    example expected:
//            4
    public int secondMaxEl(int[] arr){
        int fistMaxNum = 0;
        int secondMaxNum = 0;
        for (int el:arr) {
            if(el>fistMaxNum){
                secondMaxNum = fistMaxNum;
                fistMaxNum = el;
            } else if (el>secondMaxNum && el !=fistMaxNum) {
                secondMaxNum =el;

            }

        }
        return secondMaxNum;

    }

//    Напишите программу Java для поиска второго наименьшего элемента в массиве.
//    example input:
//            [-1, 4, 0, 2, 7, -3]
//    example expected
//-1
public int secondMinEl(int[] arr){
    int fistMinNum = 0;
    int secondMinNum = 0;
    for (int el:arr) {
        if(el<fistMinNum){
            secondMinNum = fistMinNum;
            fistMinNum = el;
        } else if (el< secondMinNum && el !=fistMinNum) {
            secondMinNum =el;

        }

    }
    return secondMinNum;

}

}
