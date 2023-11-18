package de.telran.module_1.lessons.lesson2.interface1;

public class WashMashine implements RemouteRelation, IosApp {
    @Override
    public void switchOn() {
        System.out.println("WashMashine включился");
    }

    @Override
    public void switchOff() {
        System.out.println("WashMashine выключился");
    }

    @Override
    public void swithProgram() {
        System.out.println("WashMashine переключила режим стирки");
    }

    @Override
    public void verifyAppStore() {
        System.out.println("AppStore для данной стиральной машины дает добро!");

    }

    @Override
    public void install() {

    }
}
