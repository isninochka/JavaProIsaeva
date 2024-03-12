package de.telran.algoritmus;

import java.util.Arrays;

public class Lesson23_01_24 {
    public static void main(String[] args) {
        int[]arr = {0,1,1,1,0,1,0,0,0,1,1,0,2,1,0,2,1};
       // System.out.println(Arrays.toString(binarySort(arr)));
        System.out.println(Arrays.toString(intArrSort(arr)));

        int[] arr1 = {1,2,3,4,4,5,6,7};
        sameNumber2(arr1);

    }
    private static int[] binarySort(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) count++;
        }
        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }
        for (int i = count; i < arr.length; i++) {
            arr[i] = 1;
        }
        return arr;
    }

    private static int[] intArrSort(int[] arr) {
        int count = 0;
        int count2 =0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) count++;
            else if (arr[i]== 1) count2++;
        }
        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }
        for (int i = count; i < count+count2; i++) {
            arr[i]=1;
        }
        for (int i = count+count2; i < arr.length ; i++) {
            arr[i] =2;
        }
        return arr;
    }
    private  static void sameNumber(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    System.out.println("same number is "+ arr[i]);
                }
           }

       }
    }
    private  static void sameNumber2(int[] arr){
        int sum = 0;
        int totalsum=0;
        for (int i = 0; i < arr.length; i++) {
            totalsum+=arr[i];
        }

            for (int i =1; i < arr.length; i++) {
                sum+=i;

            }
        System.out.println("same number is "+(totalsum-sum) );

    }
}
