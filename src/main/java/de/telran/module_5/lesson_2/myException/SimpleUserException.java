package de.telran.module_5.lesson_2.myException;

import java.util.Scanner;

public class SimpleUserException extends Exception {
    public static void main(String[] args) throws MyExceptionChecked {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        int valInt = scanner.nextInt();

        System.out.println("Результат = "+ 25.0/ valInt);
        if(valInt <= 0){
            throw new MyExceptionChecked();
        }
        if (valInt ==0){
            throw new MyExceptionUnchecked();
        }

    }
}
