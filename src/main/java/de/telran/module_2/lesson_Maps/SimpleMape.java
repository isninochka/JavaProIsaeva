package de.telran.module_2.lesson_Maps;

import java.util.*;

public class SimpleMape {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(2,"Vasia");
        hashMap.put(5,"Petr");
        hashMap.put(1,"Alex");
        hashMap.put(8,"Stas");
        hashMap.put(4,"Anton");
        System.out.println(hashMap);

        Map<Integer, String> likedHashMap = new LinkedHashMap<>();
        likedHashMap.put(2,"Vasia");
        likedHashMap.put(5,"Petr");
        likedHashMap.put(1,"Alex");
        likedHashMap.put(8,"Stas");
        likedHashMap.put(4,"Anton");
        System.out.println(likedHashMap);

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(2,"Vasia");
        treeMap.put(5,"Petr");
        treeMap.put(1,"Alex");
        treeMap.put(8,"Stas");
        treeMap.put(4,"Anton");
        System.out.println(treeMap);

        Map<Integer,String> treeMap1 = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2,o1);
            }
        });
        treeMap1.putAll(treeMap);
        System.out.println(treeMap1);

        System.out.println(hashMap.get(4));
        System.out.println(likedHashMap.get(4));

        hashMap.put(4,"Lesha");

        //перебор значений
        for (Map.Entry<Integer, String> entry: hashMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
        System.out.println();
        Iterator<Map.Entry<Integer,String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> element = iterator.next();
            Integer key = element.getKey();
            String value = element.getValue();
            System.out.println(key + " = " + value);
        }
        System.out.println();
        Set<Integer> keys = hashMap.keySet();
        System.out.println(keys);





    }
}
