package de.telran.homeWorks.homeWork11_12_23;
//Найти маршрут из заданного списка билетов
//        Учитывая список билетов, найти маршрут по порядку, используя данный список.
//        Вход:
//        «Berlin» -> «London»
//        «Tokyo» -> «Seoul»
//        «Mumbai» -> «Berlin»
//        «Seoul» -> «Mumbai»
//        Выход:
//        Tokyo->Seoul, Seoul->Mumbai, Mumbai->Berlin, Berlin->London

import java.util.HashMap;
import java.util.Map;

public class Task1_Routers {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();

        map.put("Berlin","London");
        map.put("Tokyo","Seoul");
        map.put("Mumbai","Berlin");
        map.put("Seoul","Mumbai");

        System.out.println(map);

        RoutersFind.routerFind(map);
    }
    
}
class RoutersFind{
    public static void routerFind(Map<String, String> map){
        Map<String, String> newMap = new HashMap<>();
        for (Map.Entry<String,String> entry: map.entrySet()){
            newMap.put(entry.getValue(), entry.getKey());
        }
        String start = null;
        for (Map.Entry<String,String> entry: map.entrySet()) {
            if(!newMap.containsKey(entry.getKey())){
                start = entry.getKey();
                break;
            }
        }

        if (start == null){
            System.out.println("Маршрут не найден");
            return;
        }

        String next = map.get(start);
        while (next != null){
            System.out.print(start + "->" + next + ", ");
            start = next;
            next = map.get(start);

        }
            


    }
}