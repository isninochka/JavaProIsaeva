package de.telran.homeWorks.year2024.homeWork26_02_24;

public class Main {
}
class Test1 {

        //System.out.println("2");

    static {
        System.out.println("1");
    }
    public Test1() {
        System.out.println("3");
    }
    public static void main(String[] args) {
        new Test1();
        new Test1();
    }
}


class Test2 {
    public static void main(String[] args) {
        final int[] array = {1, 2, 3};
        new Object() {
            void add() {
                for (int i =0; i < array.length; i++) {
                    array[i] = array[i] * 2;
                }
            }
        }.add();
        System.out.println(array);
    }
}


class Test3 {
    private Test3 test3 = new Test3();


    public static void main(String[] args) {
        Test3 test3 = new Test3();
        test3.test();
    }


    private boolean test() {
        return true ? null : true;
    }
}


class Test4 {
    public static void main(String[] args) {
        try {
            throw new Exception();
        } catch (Exception e) {
            throw new NullPointerException();
        } finally {
            throw new RuntimeException("1");
        }
    }
}
//вывод программы предыдущих классов
/*
5
true
[10, 30, 20]
30
10
10
3
[5, 30, 20]
*/

class MySingleton{
    private static MySingleton INSTANCE;
    public static MySingleton getInstance(){
        if (INSTANCE == null){
            INSTANCE = new MySingleton();
        }
        return INSTANCE;
    }
}
