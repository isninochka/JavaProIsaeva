package de.telran.algoritmus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson06_02_24 {
    public static void main(String[] args) {
        int[] array = {6, 7, 1, 2, 9, 8, 3, 0, 10, 5};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public List<Integer> quiqlySort(List<Integer> list){
        if(list.size()<=1) return list;
        List<Integer> right = new ArrayList<>();
        List<Integer> left = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();
        int pivot = list.getLast();
        for (int i = 0; i < list.size()-1; i++) {
            if (pivot >= list.get(i))
                right.add(list.get(i));
            else if (pivot < list.get(i))
                left.add(list.get(i));
            newList.addAll(quiqlySort(right));
            newList.add(pivot);
            newList.addAll(quiqlySort(left));
        }
        return newList;
    }
    public static int arrange(int[] arr, int start, int end){
        int pivot = arr[end];
        int index = start;
        for (int i = start; i < end; i++) {
            if (arr[i] < pivot) {
                int temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }
        }
        int temp = arr[index];
        arr[index] = arr[end];
        arr[end] = temp;

        return index;
    }
    public static void quickSort(int[] arr, int start, int end){
        if(end <= start) return;
        int index = arrange(arr, start, end);
        quickSort(arr, start, index-1);
        quickSort(arr, index+1, end);
    }
    public static int maxSubarray(int[] arr) {
        int maxSoFar = arr[0];
        int maxEnding = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxEnding < 0) maxEnding = arr[i];
            else maxEnding = maxEnding + arr[i];
            if (maxEnding > maxSoFar) maxSoFar = maxEnding;
        }
        return maxSoFar;
    }




}
