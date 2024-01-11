package de.telran.homeWorks.year2023.homeWork27_11_23.task1;

import java.util.Arrays;

public class DynamicIntArray {

    public static void main(String[] args) {

    }
    private int length;
    private int capacity;
    private int[] array;

    private static final int DEFAULT_CAPACITY = 10;
    private static final int PROCENT_CHANGE = 50;

    public DynamicIntArray() {
        this.length = 0;
        this.capacity = DEFAULT_CAPACITY;
        this.array = new int [DEFAULT_CAPACITY];
    }

    public DynamicIntArray(int capacity) {
        this.length = 0;
        this.capacity = capacity;
        this.array = new int[capacity];
    }

    public void add(int element){
        if (length == capacity){
            getNewCapacity();
        }
        array[length] = element;
        length++;

    }
    public void add(int[] elements){
        for (int element: elements){
        add(element);
        }
    }

    public void insert(int index, int element){
        if(index < 0 || index > length){
            System.out.println("Error");
        } else if (length == capacity) {
            getNewCapacity();
        }
        for (int i = length-1; i >= index; i--) {
            array[i+1] = array[i];
        }
        array[index] = element;
        length++;
    }
    public void delete(int index, int element){
        if(index < 0 || index >= length){
            System.out.println("Error");
        }
        for (int i =index; i < index-1; i++) {
            array[i] = array[i+1];
        }
        array[length-1] =0;
        length--;
    }
    public int get(int index){
        if(index>0 || index >=length){
            System.out.println("Error");
        }
        return array[index];
    }
    private void getNewCapacity() {
        int newCapacity = capacity +(capacity *PROCENT_CHANGE)/100;
        array = Arrays.copyOf(array, newCapacity);
        capacity = newCapacity;
    }
}
