package de.telran.module_4.lesson10_01_24;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileIO {
    public static void main(String[] args) throws IOException {
        File testFile = new File("testFile.txt");
        if(!testFile.exists()) {
            try {
                testFile.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
//Запись информации в файл
        FileOutputStream stream = new FileOutputStream(testFile);
        stream.write("Программист - это человек преобразующий кофе в код".getBytes());
        stream.close();

 //
//        File file = new File("file.txt");
//        boolean isExist = file.exists();
//        System.out.println("file exist " + isExist);
//        file = new File("newdir");
//        boolean wasCreated = file.mkdir();
//        System.out.println("created "+ wasCreated);
//
//        long length = file.length();
//        System.out.println("Length "+ length);
//
//        System.out.println(file.delete());

    }
}
