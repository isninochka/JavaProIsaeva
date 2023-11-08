package de.telran.homeWorks.homeWork08_11_23.module1.lecture1.module1.lecture1;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.fullName = "Alex";
        person1.age = 30;

        Person person2 = new Person("Sergey",27);

        String name1 = person1.fullName;
        String name2 = person2.fullName;

        person1.move();
        person1.talk();
        person2.move();
        person2.talk();

        Phone apple = new Phone("12345", "XII", 50);
        Phone samsung = new Phone("67891", "Galaxy", 70);
        Phone xiaomi = new Phone("35791", "H-XXX", 90);

        Phone[] array ={apple,samsung,xiaomi};
        for (Phone ph : array){
            System.out.println(ph.model+" "+ph.number +" "+ph.weight);
        }

        apple.receiveCall(apple.getNumber()+name1);
        samsung.receiveCall(samsung.getNumber() + name2);
        xiaomi.receiveCall(xiaomi.getNumber() +name2);
    }
}
