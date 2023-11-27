package de.telran.module_2.lesson_1Arrays;

import java.util.Arrays;

public class SimpleClone {
    public static void main(String[] args) {

        int[] arrInt = {1, 2, 6, 3, 8, 5, 4, 7};
        System.out.println(Arrays.toString(arrInt));

        int[] arrInt1= arrInt.clone();
        System.out.println(Arrays.toString(arrInt1));

        System.out.println(arrInt==arrInt1);

        int[][] arrInt2 = {{1,2,3},{5,6,7,8},{9,10,11,12}};
        System.out.println(Arrays.deepToString(arrInt2));
        int[][]arrIntClone=arrInt2.clone();
        System.out.println(arrInt2==arrIntClone);


        for (int[] arr : arrIntClone) {
            for (int j = 0; j < arr.length; j++) {
                arr[j]++;

            }
        }  System.out.println(Arrays.deepToString(arrInt2));

        int indBinary=Arrays.binarySearch(arrInt, 2);
        System.out.println(indBinary);

    }
}