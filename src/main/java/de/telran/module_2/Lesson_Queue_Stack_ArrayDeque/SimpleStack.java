package de.telran.module_2.Lesson_Queue_Stack_ArrayDeque;

import java.util.Stack;

public class SimpleStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println(stack);

        System.out.println(stack.peek()); // можно посмотреть последний эл.

        System.out.println(stack);

        if (!stack.empty()) {

            int out = stack.pop();
            System.out.println(out);
            System.out.println(stack);
        }
    }
}