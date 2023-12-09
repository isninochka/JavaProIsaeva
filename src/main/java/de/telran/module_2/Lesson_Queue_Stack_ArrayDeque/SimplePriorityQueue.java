package de.telran.module_2.Lesson_Queue_Stack_ArrayDeque;

import lombok.*;


import java.util.Comparator;
import java.util.PriorityQueue;

public class SimplePriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<People> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(new People("Vasia",20,1));
        priorityQueue.add(new People("Dania", 45,6));
        priorityQueue.add(new People("Katia", 35,5));
        priorityQueue.add(new People("Veronika Pavlovna", 65,7));

        System.out.println(priorityQueue);
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue);
        System.out.println();

        priorityQueue.add(new People("Viktor Fedorovish",55,3));
        System.out.println(priorityQueue);
        priorityQueue.add(new People("Viktor Fedorovish",55,2));
        System.out.println(priorityQueue);
        priorityQueue.add(new People("Vasia",20,1));

        for (People people : priorityQueue) {
            System.out.println(people);

        }
        System.out.println();
        System.out.println(priorityQueue.peek());
        PriorityQueue<People> priorityQueue1  = new PriorityQueue<>(new Comparator<People>() {
            @Override
            public int compare(People o1, People o2) {
                if(o1.getAge()>60)
                    return -1;
                if (o2.getAge()>60)
                    return 1;

                return Integer.compare(o1.getAge(),o2.getAge());
            }
        });
        priorityQueue1.addAll(priorityQueue);
        System.out.println(priorityQueue1);
        System.out.println(priorityQueue1.peek());
        System.out.println(priorityQueue1.poll());



    }
}
@Data
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
class People implements Comparable<People> {
    private String name;
    private int age;
    private int ticketNumber;


    @Override
    public int compareTo(People o) {

        return Integer.compare(this.ticketNumber,o.ticketNumber);
    }
}