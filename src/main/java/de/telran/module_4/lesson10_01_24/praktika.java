package de.telran.module_4.lesson10_01_24;

import java.io.*;


public class praktika {

    public static void main(String[] args) throws IOException {

        File testFile = new File("testFile.txt");
        if(!testFile.exists())
            testFile.createNewFile();

        FileOutputStream stream = new FileOutputStream(testFile);
        stream.write("Программист это человек, преобразующий кофе в код".getBytes());

    readWrite("testFile.txt");



    }

    public static void readWrite(String path) {

        try {
            File file = new File(path);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (bufferedReader.ready()) {
                System.out.println(bufferedReader.readLine());
                String string = bufferedReader.toString();

                FileOutputStream newFile = new FileOutputStream("newFile");
                for (int i = 0; i < string.length(); i++) {
                    newFile.write(string.toUpperCase().charAt(i));
                }
                System.out.println("New file is ready");
                            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.fillInStackTrace();
        }

    }

    //        try (BufferedReader reader = new BufferedReader(new FileReader(path))){
//            reader.lines()
//                    .forEach(System.out::println);

//        Path path1 = Paths.get(path);
//        try (Stream<String> stream = Files.lines(path1, StandardCharsets.UTF_8)) {
//            stream.forEach(System.out::println);

//    public static void readWrite(String path) {
//        StringBuilder stringBuilder = new StringBuilder();
//        try (FileReader fileReader = new FileReader(path)) {
//            int data;
//            while ((data = fileReader.read()) != -1) {
//              System.out.print(data);
//
//            }
//            stringBuilder.append(data);
//            System.out.println("\n");
//            System.out.println("Done");
//        } catch (Exception e) {
//            throw new NullPointerException();
//        }
//
//        try(FileWriter writer = new FileWriter(path)){
//            String str = stringBuilder.append(writer).toString();
//            for (int i = 0; i < str.length(); i++) {
//
//                String upperCase = str.toUpperCase();
//                System.out.println(upperCase);
//                writer.write(str);
//            }
//            System.out.println("DONE");
//        } catch (IOException e){
//            throw new RuntimeException(e);
//        }
//
//    }

}
//    Написать программу на Java, которая читает текст из
//.txt файла, преобразует каждую букву в верхний регистр и
//    записывает результат в новый .txt файл.



