package de.telran.homeWorks.homeWork13_12_23;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Util {
    public static Node breadthFirstSearch (Node node, int key){
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()){
            Node tempNode = queue.poll();
            System.out.println(tempNode.getValue()+" ");
            if(tempNode.getKey() == key)
                return tempNode;
            if (tempNode.getLeft() != null){
                queue.add((tempNode.getLeft()));
            }
            if (tempNode.getRight() != null){
                queue.add(tempNode.getRight());
            }
        }
        return null;
    }
    public static void breadthFirst(Node node){
        Queue<Node>queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.println(tempNode.getValue()+" ");

            if(tempNode.getLeft() !=null){
                queue.add(tempNode.getLeft());
            }
            if (tempNode.getRight() != null){
                queue.add(tempNode.getRight());
            }
        }
    }
    public static void depthPostorder (Node node){
        if(node == null)
            return;
        depthPostorder(node.getLeft());
        depthPostorder(node.getRight());
        System.out.println(node.getValue()+" ");
    }
    public static void depthInorder(Node node){
        if (node == null)
            return;
        depthPostorder(node.getLeft());
        depthPostorder(node.getRight());
        System.out.println(node.getValue()+" ");
    }
    public static void depthInorderStack(Node node){
        if (node == null)
            return;
        Stack<Node> s = new Stack<>();
        Node current = node;

        while (current != null || !s.isEmpty()){
            while (current!= null){
                s.push(current);
                current = current.getLeft();
            }
            current = s.pop();
            System.out.println(current.getValue()+" ");
            current = current.getRight();
        }
    }
    public static void depthPreorder(Node node){
        if (node== null)
            return;
        depthPreorder(node.getLeft());
        depthPreorder(node.getRight());
        System.out.println(node.getValue()+" ");
    }

}
