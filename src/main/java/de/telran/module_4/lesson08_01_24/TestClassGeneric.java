package de.telran.module_4.lesson08_01_24;

public class TestClassGeneric {
    public static void main(String[] args) {
        Test testObj = new Test();
        testObj.set(55);
        System.out.println(testObj);
        Test<String> testString = new Test<>();
        testString.set("Cool");
        System.out.println(testString.get());

        Test2<String,Integer> test2 = new Test2<>();
        System.out.println(test2.get());
        System.out.println(test2.getObj2());


    }
}

class Test<T>{
    T obj;

    T get() {
        return obj;
    }

    void set(T obj) {
        this.obj = obj;
    }

}
class Test2<T,U>{
    T obj1;
    U obj2;

    T get() {
        return obj1;
    }

    void set(T obj) {
        this.obj1 = obj;
    }

    public Test2(U obj2) {
        this.obj2 = obj2;
    }

    public Test2() {
    }

    public U getObj2() {
        return obj2;
    }

    public void setObj2(U obj2) {
        this.obj2 = obj2;
    }
}


