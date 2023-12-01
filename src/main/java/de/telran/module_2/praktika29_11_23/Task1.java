package de.telran.module_2.praktika29_11_23;

import java.util.Arrays;

public class Task1 {



    int x;
     public static void searchElSum(int[] intArray, int x){
        Arrays.sort(intArray);

         for (int i = 0; i < intArray.length; i++) {
             int start = intArray[0];
             int finish = intArray.length-1;

             if (start + finish > x) {
                 finish--;

             } if (start+finish < x){
                 start++;

             }else {
                 System.out.println(start +"+"+ finish+"=" +x);
                 System.out.println("Elements not found");
             }




             }
         }




    public static void main(String[] args) {
        int[] intArray = {2,3,4,6,8,10};

         searchElSum(intArray, 13);
    }



}
