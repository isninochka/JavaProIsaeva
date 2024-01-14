package de.telran.homeWorks.year2024.homeWork10_01_24;
import java.io.*;
import java.util.Scanner;
public class ReaderWriter {
//    1. Написать приложение, которое будет копировать информацию из файла в другой файл.
//    Путь к существующему файлу и имя нового файла нужно вводить с клавиатуры.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя файла из которого нужно скопировать информацию ->");
        String fileName = scanner.nextLine();
        System.out.println("Введите имя нового файла ->");
        String newFileName = scanner.nextLine();

        readWrite(fileName, newFileName);

    }
    public static void readWrite(String fileName, String newFileName) {
        try {
            File file = new File(fileName);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (bufferedReader.ready()) {

                String string = bufferedReader.readLine();
                FileOutputStream newFile = new FileOutputStream(newFileName);
                newFile.write(string.getBytes());
                System.out.println("New file is ready");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.fillInStackTrace();
        }

    }
}
