package de.telran.homeWorks.homeWork06_12_23.task_3;

import java.util.*;

public class BusApp {
    public static void main(String[] args) {

        HashSet<Bus>buses = new HashSet<>();
        buses.add(new Bus("35.8694",123, "HM113"));
        buses.add(new Bus("35.9694",11, "HM013"));
        buses.add(new Bus("36.8094",123, "HM007"));
        buses.add(new Bus("39.8691",123, "HM115"));
        buses.add(new Bus("30.8694",11, "HM001"));
        buses.add(new Bus("33.6694",11, "HM003"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер маршрута, для поиска ближайшего к вам автобуса");

        int searchNumber = scanner.nextInt();
        List<Bus>searchBuses = new ArrayList<>();

        for (Bus bus:buses) {

            if(bus.getRouteNumber() == searchNumber){
                searchBuses.add(bus);
              }
        }
        searchBuses.sort(Comparator.comparing(Bus::getCoordinates));
        System.out.println(searchBuses);

    }
}
