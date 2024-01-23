package de.telran.homeWorks.year2024.homeWork22_01_24;

import org.junit.jupiter.api.*;

class SimpleArraysTest {
    private final int[] arr1 = {1, 2, 5, 5, 8, 9, 7, 10};
    private final int[] arr2 = {1, 0, 6, 15, 6, 4, 7, 0};
    private int expVal;

    private int actualVal;

    private int[] expArrVal;

    private int[] actualArrVal;


    private static SimpleArrays arrays;



    @BeforeAll
    static void setUpAll() {
        arrays = new SimpleArrays();
       System.out.println("________setUpAll__________");

    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("________tearDownAll__________");
        arrays = null;
    }

    @Test
    void sameElFinder() {
        expArrVal = new int[]{1, 7};
        actualArrVal = arrays.sameElFinder(arr1,arr2);
    }

    @Test
    void deleteSameEl() {
        expArrVal = new int[]{1, 2, 5, 8, 9, 7, 10};
        actualArrVal = arrays.deleteSameEl(arr1);

    }

    @Test
    void secondMaxEl() {
        expVal = 4;
        actualVal = arrays.secondMaxEl(arr2);

    }

    @Test
    void secondMinEl() {
        expVal = 4;
        actualVal = arrays.secondMinEl(arr2);
    }
}