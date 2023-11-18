package de.telran.module_1.lessons.lesson2.interface1;

public interface AndroidApp extends  App{
    int FREE = 0;
    int SALE = 1;
    @Override
    default String autorisation() {
        return "Авторизация для Андроид";
    }
}
