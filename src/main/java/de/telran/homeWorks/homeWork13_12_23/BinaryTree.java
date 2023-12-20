package de.telran.homeWorks.homeWork13_12_23;

import java.util.Stack;
import java.util.function.Function;
import java.util.stream.IntStream;

public class BinaryTree {
    private Node root;

    public Node find(int key) {
        Node current = root;
        while (current.getKey() != key) {
            if (current.getKey() > key)
                current = current.getLeft();
            else
                current = current.getRight();
            if (current == null)
                return null;
        }
        return current;
    }

    public void insert(int key, String value) {
        Node newNode = new Node();                          // создание нового узла
        newNode.setKey(key);
        newNode.setValue(value);

        if (root == null)                                   // если корневой узел не существует
            root = newNode;                                 // то новый элемент и есть корневой узел
        else {                                              // корневой узел занят
            Node current = root;
            Node parent = null;

            while (true) {                                  // мы имеем внутренний выход из цикла

                parent = current;

                if (key == current.getKey())                // если такой элемент в дереве уже есть, не сохраняем его
                    return;                                 // просто выходим из него

                else if (key < current.getKey()) {          // движение влево
                    current = current.getLeft();
                    if (current == null) {                  // если был достигнут конец цепочки
                        parent.setLeft(newNode);            // то вставить слева и выйти из методы
                        return;
                    }
                } else {                                    // или направо?
                    current = current.getRight();
                    if (current == null) {                  // если был достигнут конец цепочки
                        parent.setRight(newNode);           // то вставить справа
                        return;
                    }
                }
            }
        }
    }

    public void print(Node node) {
        if (node != null) {
            print(node.getLeft());
            node.printNode();
            print(node.getRight());
        }
    }

    public void print() {
        Stack<Node> globalStack = new Stack<>();
        globalStack.push(root);

        int gaps = 32;
        boolean isRowEmpty = false;
        String separator = "___________________________________________";
        System.out.println(separator);

        while (!isRowEmpty) {
            Stack<Node> localStack = new Stack<>();
            isRowEmpty = true;

            for (int i = 0; i < gaps; i++) {
                System.out.println(' ');
                while (!globalStack.isEmpty()) {
                    Node temp = (Node) globalStack.pop();
                    if (temp != null) {
                        System.out.println(temp.getValue());
                        localStack.push(temp.getLeft());
                        localStack.push(temp.getRight());
                        if (temp.getLeft() != null || temp.getRight() != null)
                            isRowEmpty = false;
                    } else {
                        System.out.println("__");
                        localStack.push(null);
                        localStack.push(null);
                    }

                    IntStream.range(0, gaps * 2 - 2).map(j -> ' ').forEach(System.out::println);
                    System.out.println();
                    gaps /= 2;
                    while (!localStack.isEmpty()) {
                        globalStack.push(localStack.pop());
                    }
                }
                System.out.println(separator);
            }
        }

    }

    public Node getRoot() {
        return root;
    }


    public Node findByValue(String value) {
        Node current = root;
        Function<String, Integer> valueConverter = x->Integer.valueOf(value);
       int x = valueConverter.apply(value);
       int rootEl = valueConverter.apply(root.getValue());

        while (rootEl != x) {
            if(x<rootEl){
                root = root.getLeft();
        } else {
                root = root.getRight();
        } if(root == null){
                return null;
            }

        }
        return root;
    }
}

