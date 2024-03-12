package de.telran.algoritmus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lesson30_01_24 {
    public static void main(String[] args) {
        List<Integer> arrList = new ArrayList<>();
        arrList.add(5);
        arrList.add(1);
        arrList.add(9);
        arrList.add(4);
        arrList.add(6);
        arrList.add(3);
        arrList.add(1);
        arrList.add(0);
        arrList.add(8);

        //System.out.println(quickSort1(arrList));
        System.out.println(quickSort2(arrList));
        int[] array = {4,3,6,7,0,1,8,9,5};
        int index = 0;
        int pivot = array[array.length-1];
        for (int i=0;i<array.length-1;i++){
            if (array[i]<pivot) {
                int temp = array[i];
                array[i] = array[index];
                array[index] = temp;
                index++;
            }
        }
        int temp = array[array.length-1];
        array[array.length-1] = array[index];
        array[index] = temp;
        System.out.println(Arrays.toString(array));

    }

    public static List<Integer> quickSort2(List<Integer> arrList){
        if(arrList.size()<=1) return arrList;
        int pivot = arrList.get(arrList.size()-1);
        int index=0;
        List<Integer> list= new ArrayList<>();
        List<Integer> newList= new ArrayList<>();
        for (int i = 0; i < arrList.size()-1; i++) {
            if(arrList.get(i)<pivot){

                } else i++;
        }
        newList.addAll(quickSort2(list));
        newList.add(pivot);
        return newList;
    }
    public static List<Integer> quickSort1(List<Integer> arrList) {
        if(arrList.size()<=1) return arrList;
        int pivot = arrList.get(arrList.size()-1);
        List<Integer> newList= new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> left = new ArrayList<>();
        for (int i = 0; i < arrList.size()-1; i++) {
            if (arrList.get(i)<pivot) left.add(arrList.get(i));
            else right.add(arrList.get(i));
        }

        newList.addAll(quickSort1(left));
        newList.add(pivot);
        newList.addAll(quickSort1(right));
        return newList;





    }
    static void quickSort(int[] sortArr, int low, int high) {
        //завершить,если массив пуст или уже нечего делить
        if (sortArr.length == 0 || low >= high) return;

        //выбираем опорный элемент
        int middle = low + (high - low) / 2;
        int border = sortArr[middle];

        //разделияем на подмассивы и меняем местами
        int i = low, j = high;
        while (i <= j) {
            while (sortArr[i] < border) i++;
            while (sortArr[j] > border) j--;
            if (i <= j) {
                int swap = sortArr[i];
                sortArr[i] = sortArr[j];
                sortArr[j] = swap;
                i++;
                j--;
            }
        }

        //рекурсия для сортировки левой и правой части
        if (low < j) quickSort(sortArr, low, j);
        if (high > i) quickSort(sortArr, i, high);
    }
}
