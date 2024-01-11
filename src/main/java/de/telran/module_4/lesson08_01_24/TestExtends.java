package de.telran.module_4.lesson08_01_24;

public class TestExtends {
    public static void main(String[] args) {
        OnlyNumber o1 = new OnlyNumber<>(5);
        o1.print();
        //OnlyNumber o2 = new OnlyNumber<>("Slon");
        //o2.print();
        OnlyNumber o3 = new OnlyNumber<>(5.5);


    }
}
 class OnlyNumber<T extends Number>{
    private T number;

     public OnlyNumber(T number) {
         this.number = number;
     }
     public void print(){
         System.out.println(number);
     }
 }