package de.telran.homeWorks.year2023.homeWork08_12_23.task_1_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BrickStore {
    public static void main(String[] args) {
        StoreEmployees employees = new StoreEmployees();
        //Pеализация склада с единственной дверью.

        Stack<Brick> brickStore1Door = new Stack<>();

        System.out.println("Поступила новая партия кирпичей:");
        employees.acceptsProducts();
        employees.unloadsProducts();
        brickStore1Door.push(new Brick(BrickType.CLINKER_BRICK, 2000, "Clinker&Co", "Poland"));
        brickStore1Door.push(new Brick(BrickType.SILICATE_BRICK, 900, "Silicaterrr", "France"));
        employees.placesProducts();
        System.out.println(brickStore1Door);
        System.out.println("Добавляем еще партию кирпичей:");
        brickStore1Door.push(new Brick(BrickType.CERAMIC_BRICK, 1000, "Ceramichno", "Czech Republic"));
        brickStore1Door.push(new Brick(BrickType.FIRECLAY_BRICK, 500, "Müller&Co", "Germany"));
        brickStore1Door.push(new Brick(BrickType.HYPPER_PRESSED_BRICK, 1300, "Pressono", "Italy"));
        System.out.println(brickStore1Door);
        employees.releasesProducts();
        System.out.println(brickStore1Door.peek());
        employees.loadsProducts();
        System.out.println(brickStore1Door.pop());
        System.out.println(brickStore1Door.pop());
        employees.recordsProducts();
        System.out.println(brickStore1Door);

        //Реализация работы склада с двумя дверьми
        Queue<Brick> brickStore2Doors = new LinkedList<>();
        System.out.println("Поступила новая партия кирпичей:");
        employees.acceptsProducts();
        employees.unloadsProducts();
        brickStore2Doors.add(new Brick(BrickType.CLINKER_BRICK, 2000, "Clinker&Co", "Poland"));
        brickStore2Doors.add(new Brick(BrickType.SILICATE_BRICK, 900, "Silicaterrr", "France"));
        employees.placesProducts();
        System.out.println(brickStore2Doors);
        System.out.println("Добавляем еще партию кирпичей:");
        brickStore2Doors.add(new Brick(BrickType.CERAMIC_BRICK, 1000, "Ceramichno", "Czech Republic"));
        brickStore2Doors.add(new Brick(BrickType.FIRECLAY_BRICK, 500, "Müller&Co", "Germany"));
        brickStore2Doors.add(new Brick(BrickType.HYPPER_PRESSED_BRICK, 1300, "Pressono", "Italy"));
        System.out.println(brickStore2Doors);
        employees.releasesProducts();
        System.out.println(brickStore2Doors.peek());
        employees.loadsProducts();
        System.out.println(brickStore2Doors.remove());
        System.out.println(brickStore2Doors.remove());
        employees.recordsProducts();
        System.out.println(brickStore2Doors);
        System.out.println();
        System.out.println("Сравнение остатков на складах");
        System.out.println(brickStore1Door);
        System.out.println(brickStore2Doors);


    }
}