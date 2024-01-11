package de.telran.homeWorks.year2023.homeWork06_12_23.task_1;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Restaurant {


    public static void main(String[] args) {

        Set<Order> orderSet= new LinkedHashSet<>();
        orderSet.add(new Order(1,5,"Chiken","Ice"));
        orderSet.add(new Order(1,5,"Fish","Kecks"));
        orderSet.add(new Order(2,3,"Salat","Tiramisu"));
        orderSet.add(new Order(3,9,"Steak","Ice"));
        orderSet.add(new Order(2,4,"Chiken","Napoleon"));
        orderSet.add(new Order(1,7,"Lobster","Crousant"));

        Iterator<Order> iterator = orderSet.iterator();
        while (iterator.hasNext()){
            Order order = iterator.next();
            System.out.println("Блюдо "+order.getDish()+" и десерт "+order.getDesert()+
                    " для стола № "+order.getTableId()+" готовится");
            iterator.remove();
        }

        System.out.println(orderSet);


    }
}

class Order{
    private int garsonId;
    private int tableId;
    private String dish;
    private String desert;

    public Order() {
    }

    public Order(int garsonId, int tableId, String dish, String desert) {
        this.garsonId = garsonId;
        this.tableId = tableId;
        this.dish = dish;
        this.desert = desert;
    }

    public int getGarsonId() {
        return garsonId;
    }

    public int getTableId() {
        return tableId;
    }

    public String getDish() {
        return dish;
    }

    public String getDesert() {
        return desert;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return garsonId == order.garsonId && tableId == order.tableId
                && Objects.equals(dish, order.dish) && Objects.equals(desert, order.desert);
    }

    @Override
    public int hashCode() {
        return Objects.hash(garsonId, tableId, dish, desert);
    }

    @Override
    public String toString() {
        return "Order{" +
                "garsonId=" + garsonId +
                ", tableId=" + tableId +
                ", dish='" + dish + '\'' +
                ", desert='" + desert + '\'' +
                '}';
    }
}

