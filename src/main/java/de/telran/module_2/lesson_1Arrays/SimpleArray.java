package de.telran.module_2.lesson_1Arrays;

import java.util.Arrays;

public class SimpleArray {
    public static void main(String[] args) {
        int []arrInt = {1,2,6,3,8,5,4,7};
        System.out.println(arrInt[5]);
        System.out.println(Arrays.toString(arrInt));
//        for (int el : arrInt){
//            el++;
//        }
        for (int i = 0; i < arrInt.length ; i++) {
            arrInt[i]++;

        }
        System.out.println(Arrays.toString(arrInt));

        int[][] arrInt2 = {{1,2,3},{5,6,7,8},{9,10,11,12}};//new int[3][3];
        System.out.println(arrInt2[1][2]);
        System.out.println(Arrays.toString(arrInt2));

        for (int[] el:arrInt2) {
            System.out.println(Arrays.toString(el));

        }

        for (int[] arr : arrInt2) {
            for (int j = 0; j < arr.length; j++) {
                arr[j]++;

            }
        }  System.out.println(Arrays.deepToString(arrInt2));

        int[][][] arrInt3 ={{{1,2,3},{5,6,7,8}},
                            {{9,10,11},{5,6,7}},
                            {{11,12,13},{15,16,17}}};

        System.out.println(Arrays.deepToString(arrInt3));

        for (int[][] arr2 : arrInt3) {
            for (int[] arr : arr2) {
                for (int k = 0; k < arr.length; k++) {
                    arr[k]++;
                }

            }
        }
        System.out.println(Arrays.deepToString(arrInt3));

        int[][] arrInt2_ = {{1,2,3},{5,6,7,8,15},{9,10,11,12}};
        System.out.println(Arrays.deepToString(arrInt2_));




    }
}
