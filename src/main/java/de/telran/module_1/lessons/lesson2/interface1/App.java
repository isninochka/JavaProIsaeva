package de.telran.module_1.lessons.lesson2.interface1;

public interface App {
    void install();

    default String autorisation() {
        return"Я пользователь";
    }


}
