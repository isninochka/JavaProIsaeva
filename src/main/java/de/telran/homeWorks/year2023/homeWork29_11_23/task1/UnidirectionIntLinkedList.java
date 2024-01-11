package de.telran.homeWorks.year2023.homeWork29_11_23.task1;

public class UnidirectionIntLinkedList {

   private int size;
   private Node head;

   public void add (int item){
      if (head == null){
         head = new Node(item);
      } else {
         Node current = head;
         while (current.next != null){
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
         Node newNode = new Node(item);
         Node current = head;
         for (int i = 0; i < index-1; i++) {
            current = current.next;
            current.next = newNode;
            size ++;
         }
      }
   }

   public void  addFirst(int item){
      Node newNode = new Node(item);
      newNode.next = head;
      size++;
   }

   public void addLast(int item){
      add(item);
   }

   public int get(int index){
      if (index < 0 || index > size){
         System.out.println("Index incorrect");
      }
      Node current = head;
      for (int i = 0; i < index; i++) {
         current = current.next;
      } return current.item;
   }
   public  int set(int index, int item){
      if (index < 0 || index > size){
         System.out.println("Index incorrect");
      }
      Node current = head;
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
            removedElem = head.item;
            head = head.next;
         } else {
            Node current = head;
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
          int removedElem = head.item;
          head = head.next;
          size--;
          return  removedElem;
   }
   public int removeLast(){
          int removedElem;
          if (size == 1){
             removedElem = head.item;
             head = null;
          } else{
             Node current = head;
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
      Node current = head;
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
      head = null;
      size = 0;
   }

}
