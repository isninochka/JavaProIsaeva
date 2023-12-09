package de.telran.module_2.Lesson_Queue_Stack_ArrayDeque;

import java.util.LinkedList;
import java.util.Queue;

public class SempleQueue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("One");
        queue.add("Two");
        queue.add("Three");
        queue.add("Four");
        queue.add("Five");
        queue.add("Sex");

        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.remove()); //будет ругаться если больше нет элементов
        System.out.println(queue);

        for (String el : queue) {
            System.out.println(el);
        }
    }
}
