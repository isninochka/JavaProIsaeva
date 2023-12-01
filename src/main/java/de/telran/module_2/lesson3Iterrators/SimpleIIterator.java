package de.telran.module_2.lesson3Iterrators;

import java.util.*;

public class SimpleIIterator {
    public static void main(String[] args) {
        List<Integer> myIntList = new ArrayList<>();

        myIntList.add(2);
        myIntList.add(5);
        myIntList.add(3);
        myIntList.add(7);
        myIntList.add(3);
        myIntList.add(9);

        System.out.println(myIntList);

        Iterator<Integer>iterator = myIntList.iterator();

        while (iterator.hasNext()){
            int elInt = iterator.next();
            System.out.println(elInt);
            if(elInt % 2 == 0) iterator.remove();

        }
        System.out.println(myIntList);
//        for (int el: myIntList) {
//            System.out.println(el);
//         } такой же код как и выше, только итератор скрыт. Код становиться чище

//        for (int i = 0; i < myIntList.size(); i++) {
//            System.out.println(myIntList.get(i));
//        } такой же код, но можно внести изменения, а если хотим удалить, то только итератор

    List<Cat>catsList = Arrays.asList(new Cat("Murka", 10),
                                    new Cat("Barsic", 5));

        Iterator<Cat>iterCat = catsList.iterator();

        while (iterCat.hasNext()){
            Cat cat =iterCat.next();
            System.out.println(cat);
            cat.setAge(cat.getAge()+1);

            iterCat.next().setAge(111);
        }
        System.out.println(catsList);

//        Vector<Integer> vInt = new Vector<>();
//        vInt.add(2);
//        vInt.add(5);
//        vInt.add(3);
//        vInt.add(7);
//        vInt.add(3);
//        vInt.add(9);
//
//        Enumeration<Integer> enumeration =vInt.elements();
//        while (enumeration.hasMoreElements())
//            System.out.println(enumeration.nextElement());

    }
}

class Cat{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}