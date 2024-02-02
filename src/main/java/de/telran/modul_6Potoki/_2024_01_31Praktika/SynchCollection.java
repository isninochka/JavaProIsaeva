package de.telran.modul_6Potoki._2024_01_31Praktika;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Map<Integer, String> map = new HashMap<>();
        map.put(null, "");
        map.put(null, null);


        /**
         * Synch Collection
         */

        List<Integer> list1 = Collections.synchronizedList(list);

        /**
         * Cunc Collection
         */

        CopyOnWriteArrayList<String> list2 = new CopyOnWriteArrayList<>();
    }
}
