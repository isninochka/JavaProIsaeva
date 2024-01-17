package de.telran.module_5.lesson_2.myException;

public class MyExceptionUnchecked extends RuntimeException {
    private int number;

    public MyExceptionUnchecked() {
    }
    public MyExceptionUnchecked(String message, int number){
        super((message));
    }
}
