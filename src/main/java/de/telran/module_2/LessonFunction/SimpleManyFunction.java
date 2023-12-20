package de.telran.module_2.LessonFunction;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class SimpleManyFunction {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Tusik", 10, "Dvorterier");
        dog1.printCallName("Fas");
        dog1.printAge("Haw old?");
        dog1.getPrise("Alex");

//        MyFuncInterface int1 = new MyFuncInterface() {
//            @Override
//            public void printCall(Dog dog, String call) {
//                System.out.println(call + " " + dog.getName());
//            }
//        };
        //int1.printCall(dog1,"Fas");
        MyFuncInterface int2 = (dog,call)-> System.out.println(call + " " + dog.getName());
        int2.printCall(dog1,"Fas");
        MyFuncInterface int3 = (dog,call)-> System.out.println(call + " " + dog.getAge());
        int3.printCall(dog1,"How old?");
        int3 = (dog, call)-> System.out.println(call+" "+dog.getBreed());
        int3.printCall(dog1,"What's breed?");

        int3 = (dog,call)->{
            int price = dog.getAge()*10;
            System.out.println(call + " can sale "+dog.getName()+" of "+price+" euro");
        };
        int3.printCall(dog1,"Petr");
        sendEmail(dog1,"Max",int3);

    }

    static void sendEmail(Dog dog, String message, MyFuncInterface bodyEmail){
        System.out.println("I send E-mail ");
        bodyEmail.printCall(dog, message);
    }
}
interface MyFuncInterface{
    void printCall(Dog dog, String call);
}
@Getter
@AllArgsConstructor
class Dog{
    private String name;
    private int age;
    private String breed;

    public void printCallName(String call){
        System.out.println(call+" "+name);
    }
    public void printAge(String call){
        System.out.println(call+" "+age);
    }
    public void  getBreed(String call){
        System.out.println(call+" "+breed);
    }
    public void getPrise(String peopleName){
        int price = age*10;
        System.out.println(peopleName + " can sale "+name+" of "+price+" euro");
    }

}
