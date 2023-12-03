package de.telran.homeWorks.homeWork01_12_23.task1_1;

import java.util.Iterator;


public class UnidirectionIntLinkedList implements Iterator<Integer> {

   private int size;
   private Node newNode;

   public void add (int item){
      if (newNode == null){
         newNode = new Node(item);
      } else {
         Node current = newNode;
         while (next()!= null){
            current = current.next;
         }
         current.next = new Node(item);
      }
      size++;
   }

   public void add (int index, int item){
      if (index < 0 || index > size){
         System.out.println("Index incorrect");
      }
      if (index == 0){
         addFirst(item);
      } else {

         for (int i = 0; i < index-1; i++) {
            new Node(item).next = new Node(item);;
           size ++;
         }
      }
   }

   public void  addFirst(int item){
       new Node(item).next = new Node(item);
      size++;
   }

   public void addLast(int item){
      add(item);
   }

   public int get(int index){
      if (index < 0 || index > size){
         System.out.println("Index incorrect");
      }
      Node current = newNode;
      for (int i = 0; i < index; i++) {
         current = current.next;
      } return current.item;
   }
   public  int set(int index, int item){
      if (index < 0 || index > size){
         System.out.println("Index incorrect");
      }
      Node current = newNode;
      for (int i = 0; i < index; i++) {
         current = current.next;
      }
      int oldElem = current.item;
      current.item = item;
      return oldElem;
   }

   public int remove(int index){
         if (index < 0 || index > size){
            System.out.println("Index incorrect");
         }
         int removedElem;
         if (index == 0){
            removedElem = newNode.item;
            newNode = newNode.next;
         } else {
            Node current = newNode;
            for (int i = 0; i < index-1; i++) {
               current = current.next;
            }
            removedElem = current.next.item;
            current.next = current.next.next;
         }
         size--;
         return removedElem;
   }
   public int removeFirst(){
          int removedElem = newNode.item;
          newNode = newNode.next;
          size--;
          return  removedElem;
   }
   public int removeLast(){
          int removedElem;
          if (size == 1){
             removedElem = newNode.item;
             newNode = null;
          } else{
             Node current = newNode;
             while (current.next.next != null){
                current = current.next;
             }
             removedElem = current.next.item;
             current.next = null;
          }
          size--;
          return removedElem;
   }

   public int indexOf(int item){
      Node current = newNode;
      int index = 0;
      while (current !=null){
         if (current.item == item){
            return index;
         }
         current = current.next;
         index++;
      }
      return -1;
   }

   public boolean contains(int item){
      return indexOf(item) != -1;
   }

   public void clear(){
      newNode = null;
      size = 0;
   }


   @Override
   public boolean hasNext() {
      return false;
   }

   @Override
   public Integer next() {
      return null;
   }
}
class Node {
   int item;
   Node next;

   public Node(int item) {
      this.item = item;
      this.next = null;
   }
}
