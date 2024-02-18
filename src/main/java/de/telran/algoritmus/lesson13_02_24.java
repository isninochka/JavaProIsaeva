package de.telran.algoritmus;

import java.util.Arrays;

public class lesson13_02_24 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 60, 50, 40, 30, 70, 80, 90};
        int[] falshIndexes = findFalshIdex(arr);

        for (int index : falshIndexes) {
            System.out.println(index);
        }

        int[] array = {10, 20, 60, 80, 100, 30, 70, 90, 120};
        System.out.println(Arrays.toString(

                findIndices2(array)));

        int[] A = { 10, 20, 60, 50, 40, 30, 70, 80, 90 };
        findIndices(A);

    }

    private static int[] findFalshIdex(int[] arr) {
        int[] indexes = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i * 10 + 10) {
                indexes[index] = i;
                index++;
            }

        }
        int[] falshIndexes = new int[index];
        System.arraycopy(indexes, 0, falshIndexes, 0, index);
        return falshIndexes;
    }

    public static int[] findIndices2(int[] arr) {
        int index1 = -1;
        int index2 = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[i + 1]) {
                index1 = i;
                break;
            }
        }
        for (int i = arr.length - 1; i > 0; i--) {
            if (arr[i] < arr[i - 1]) {
                index2 = i;
                break;
            }
        }
        return Arrays.copyOfRange(arr, index1, index2 + 1);
    }
    public static void findIndices(int[] A)
    {
        int leftIndex = -1, rightIndex = -1;
        int max_so_far = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++)
        {
            if (max_so_far < A[i]) {
                max_so_far = A[i];
            }

            if (A[i] < max_so_far) {
                rightIndex = i;
            }
        }

        int min_so_far = Integer.MAX_VALUE;
        for (int i = A.length - 1; i >= 0; i--)
        {
            if (min_so_far > A[i]) {
                min_so_far = A[i];
            }

            if (A[i] > min_so_far) {
                leftIndex = i;
            }
        }
        System.out.print( leftIndex + "," + rightIndex);
    }
}
class Train {
    Wagon root;
    Train(int value) {
        this.root = new Wagon(value);

    }
    public void addWagon(int value) {
        Wagon current = this.root;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new Wagon(value);
    }

    public int wagonCounter(){
        int counter = 1;
        Wagon current = this.root;
        while (current.next != null) {
            current=current.next;
            counter++;
        }
        return counter;
    }

    public boolean findValue(int value) {
        boolean isValue = false;
        Wagon current = this.root;
        while (current.next != null) {
            current = current.next;
            if (current.value == value) {
                isValue = true;


                break;
            }
        }
       return isValue;
    }

    public int findWagonNumber(int value) {
        int index=1;
        Wagon current = this.root;
        while (current != null) {
            if (value == current.value) return index;
            current = current.next;
            index++;
        }
        System.out.println("Вагона с таким количеством людей, в данном поезде нет!");
        return -1;
    }

    }




class Wagon {
    int value;
    Wagon next;

    Wagon (int value){
        this.value=value;
        this.next = null;
    }

}
class Main {
    public static void main(String[] args) {
        Train train = new Train(10);
        System.out.println(train.root.next);
        train.addWagon(20);
        train.addWagon(30);
        train.addWagon(40);
        System.out.println(train.root.next.next.next.value);
        System.out.println(train.wagonCounter());
        System.out.println(train.findValue(40));
        System.out.println(train.findWagonNumber(40));
    }


}



