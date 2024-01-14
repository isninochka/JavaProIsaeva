package de.telran.homeWorks.year2024.homeWork10_01_24;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class DirCopy {
//    2. Написать приложение, которое будет копировать содержимое одной папки в другую со всеми вложениями
//            (другие папки, файлы).
//    Путь к существующей папке и имя новой папки нужно вводить с клавиатуры.
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя папки из которой нужно скопировать информацию ->");
        String dirName = scanner.nextLine();

        File dirPath = new File(dirName);
        if (!dirPath.exists()){
            System.out.println("Данная папка не найдена");
            return;
        }
        List<File> fileList = new ArrayList<>();
        toListDirAndFiles(dirPath,fileList);
        System.out.println("Введите имя новой папки ->");
        String newDirName = scanner.nextLine();
        File newDirPath = new File(newDirName);
        if(!newDirPath.exists()){
            if (!newDirPath.mkdir()){
                System.out.println("Не удалось создать папку для копирования");
           }
        }

        copyDirWithFiles(fileList, dirPath.toPath(), newDirPath.toPath());



    }

    // Пути файлов для проверки программы
    //D:\testJava
   //C:\Users\Isaev\IdeaProjects\JavaProIsaeva\src\main\java\de\telran\testDir



    private static void copyDirWithFiles(List<File> fileList, Path directory, Path newDirectory){
        for (File file: fileList) {
            try {
                Path dir = file.toPath();
                Path newDir = newDirectory.resolve(directory.relativize(dir));
                Files.copy(dir,newDir, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Папка со всем содержимым успешно скопирована ->"+newDir.toAbsolutePath());
            } catch (IOException e){
                System.out.println("Не удалось скопироват файл -> "+ file.getAbsolutePath());
                e.printStackTrace();
            }
        }
    }

    private static void toListDirAndFiles(File dir, List<File> fileList){
        if (dir.isDirectory()){
            File[] files = dir.listFiles();
            if (files != null){
                for (File file:files) {
                    if(file.isDirectory()){
                        fileList.add(file);
                        toListDirAndFiles(file,fileList);
                    } else {
                        fileList.add(file);
                    }
                }
            }
        }
    }

}
