package de.telran.summary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static de.telran.summary.Summary16_02_24TestsAndMethods.findMax;
import static de.telran.summary.Summary16_02_24TestsAndMethods.isAddEl;
import static org.junit.jupiter.api.Assertions.*;

class summary16_02_24Test {
    int[] arr = {2,5,8,4,9,1};

    @Test
    void findMaxTest() {
        assertEquals(9,findMax(arr));

    }

    @Test
    void isAddElTrueTest() {
        List<Integer> arrayList = new ArrayList<>(List.of(1, 3, 5, 7));
        assertTrue(isAddEl(arrayList,0));

    }
    @Test
    void isAddElFalshTest() {
        List<Integer> arrayList = new ArrayList<>(List.of(1, 3, 5, 7,0));
        assertFalse(isAddEl(arrayList,9));

    }

}