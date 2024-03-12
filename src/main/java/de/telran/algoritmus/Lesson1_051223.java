package de.telran.algoritmus;

public class lesson1_051223 {
    public static int maxEl(int[]array){
        int max= array[0];
        for (int i = 0; i < array.length; i++) {
            if(max>array[i]){
                max=array[i];

            }

        } System.out.println("Самый большой элемент "+max);
        return max;
    }

    public static int minEl(int[] arr){
        int min= arr[0];
        for (int i = 0; i < arr.length; i++) {

            if(min<arr[i]){
                min=arr[i];
            }



        }System.out.println("Самый маленький элемент "+ min);
        return min;
    }
    public static void main(String[] args) {


    int[] intArr = {1,2,3,4,5,6,7,8};

        for (int i = 0; i < intArr.length; i++) {
            if (i % 2 == 0) System.out.println(i + " is an even number");
            else System.out.println(i + " is an odd number");
        }

        maxEl(intArr);
        minEl(intArr);

        int[] arr = {10,20,30,40,50};
        int sum = 50;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]+(arr[i]+1)==sum){
                System.out.println(arr[i]+arr[i]+sum);
            }

        }








    }
}
