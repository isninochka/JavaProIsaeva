package de.telran.lessonsPlakuchiy.module_1.module_2.summary15_12_23;

import java.util.HashMap;
import java.util.Map;

public class HW11_12_23_Task1 {
    public static void main(String[] args) {


    Map<String,String> map = new HashMap<>();

        map.put("Berlin","London");
        map.put("Tokyo","Seoul");
        map.put("Mumbai","Berlin");
        map.put("Seoul","Mumbai");


        System.out.println(map);

        Map<String,String> reverseMap = new HashMap<>();

        for (Map.Entry<String,String> el:map.entrySet()) {
            reverseMap.put(el.getValue(),el.getKey());
        }

        String start = null;
        for (Map.Entry<String,String> el:map.entrySet()) {
            if(!reverseMap.containsKey(el.getKey())){
            start = el.getKey();
            break;
            }
        }
        String toCity = map.get(start);

        while (toCity!= null){
            System.out.println(start+"->"+toCity);
            start = toCity;
            toCity = map.get(toCity);
        }
}
}