package de.telran.module_5.lesson_2;


import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleExeption {
    public static void main(String[] args) {
        InputIntRecurs();
    }


public static int InputIntRecurs(){
    int inInt = 0;


        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите число: ");
            inInt = scanner.nextInt();
            inInt = inInt*inInt;
            System.out.println("Квадрат вашего числа равен: " + inInt);

        }catch (InputMismatchException e){
            System.out.println("Введите корректные данные: ");
            inInt=InputIntRecurs();

        }
        return inInt;
        }

}