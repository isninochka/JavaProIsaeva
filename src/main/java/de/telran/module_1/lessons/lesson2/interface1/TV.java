package de.telran.module_1.lessons.lesson2.interface1;

public class TV implements RemouteRelation, App{
    @Override
    public void switchOn() {
        System.out.println("TV on");
    }

    @Override
    public void switchOff() {
        System.out.println("TV off");

    }

    @Override
    public void swithProgram() {
        System.out.println("TV changed channel");

    }

    @Override
    public void install() {
        System.out.println("Инсталяция для ТВ");

    }

    @Override
    public String autorisation() {

        return "Я пользователь Вася, с Андроид ТВ";
    }
}
