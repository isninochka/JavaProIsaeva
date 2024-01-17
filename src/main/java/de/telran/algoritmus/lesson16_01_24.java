package de.telran.algoritmus;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lesson16_01_24 {
    public static void main(String[] args) {
        System.out.println(hanoi(3,"A","B","C"));

        int[]arr1 = {1,3,5,8,10};
        int[]arr2 = {2,4,7,8,11,13,14};

        int[] array = {1, 2, 5, 4, 0, 2, 5, 8};

        System.out.println(Arrays.toString(merge(arr1,arr2)));
        System.out.println(Arrays.toString(mergeSort(array)));

    }
    public static String hanoi(int n, String start,String middle, String end){
        if(n==1) return start+end+" ";
        return hanoi(n-1, start,end,middle)+start+end +hanoi(n-1, middle, end,start);
    }


    public static int[] merge(int[]arr1, int[]arr2){
        int i = 0;
        int j = 0;
        int index = 0;
        int[] arr = new int[arr1.length+ arr2.length];
        while (i < arr1.length && j< arr2.length){
            if(arr1[i]<arr2[j]){
                arr[index++] = arr1[i++];
            }else {
                arr[index++] = arr2[j++];
            }
        }
        while (i < arr1.length){
            arr[index++] = arr1[i++];
        }
        while (j < arr2.length){
            arr[index++] = arr2[j++];
        }
        return arr;

        }

    public static int[] mergeSort(int[] arr){
        if (arr.length <= 1) return arr;
        int[] left = Arrays.copyOfRange(arr,0,arr.length / 2);
        int[] right = Arrays.copyOfRange(arr,arr.length / 2,arr.length);
        return merge(mergeSort(left), mergeSort(right));
    }
    }

