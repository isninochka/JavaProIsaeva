package de.telran.algoritmus.lesson_19_12_23;

import java.util.Arrays;


public class lesson27_02_24 {
    public static void main(String[] args) {
        int[] array = {1,5,6,9};
        System.out.println(pushMethod(array,5));
        Stack stack = new Stack();
        stack.push(10,30);
        stack.push(20);

        System.out.println(stack.hasElement(10));
        System.out.println(Arrays.toString(stack.items));
        System.out.println(stack.findMax());
        System.out.println(stack.findMin());
        System.out.println(stack.shift());
        System.out.println(stack.unshift(5));
        System.out.println(Arrays.toString(stack.items));

    }
    public static int pushMethod(int[] array, int newNum){
        array = Arrays.copyOf(array, array.length+1);
        array[array.length-1]=newNum;
       return array.length;
    }
}

class Stack{
    int[] items = new int[0];
    public int push (int ...values){
        int[]updatedArray = new int[items.length+ values.length];
        for (int i = 0; i < items.length; i++) {
            updatedArray[i] = items[i];
        }
        for (int i=0;i<values.length;i++){
            updatedArray[i+items.length] = values[i];
        }
        items = updatedArray;
        return items.length;
    }
    public int pop(){
        if(this.isEmpty()){
            throw new NullPointerException("Array is empty");
        }
        int lastElement = items[items.length-1];
        items = Arrays.copyOfRange(items,0,items.length-1);
        return lastElement;
    }

    public int itemsLength(){
        return items.length;
    }
    public boolean isEmpty(){
        return items.length == 0;
    }

    public boolean hasElement(int element){
        boolean hasElement = false;
        for (int item : items) {
            if (item == element) ;
            return true;
        }
        return hasElement;
    }

    public int findMax(){
        int max = items[0];
        for (int i = 0; i < items.length; i++) {
            if(items[i]>max){
                max = items[i];
            }
        }
        return max;
    }
    public int findMin(){
        int min = items[0];
        for (int i = 1; i < items.length; i++) {
            if(items[i]<min){
                min = items[i];
            }
        }
        return min;
    }
    public int shift(){
        if(this.isEmpty()){
            throw new NullPointerException("Array is empty");
        }
        int firstElement = items[0];
        items = Arrays.copyOfRange(items,1,items.length);
        return firstElement;
    }
    public int unshift (int ...values){
        int[]updatedArray = new int[values.length + items.length];
        for (int i = 0; i < values.length; i++) {
            updatedArray[i] = values[i];
        }
        for (int i=0;i<items.length;i++){
            updatedArray[i+values.length] = items[i];
        }
        items = updatedArray;
        return items.length;
    }


}
