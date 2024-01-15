package de.telran.module_4.lesson10_01_24;

import java.io.*;
import java.util.Stack;

public class praktika {

    public static void main(String[] args) throws IOException {
//    Написать программу на Java, которая читает текст из
//.txt файла, преобразует каждую букву в верхний регистр и
//    записывает результат в новый .txt файл.

        File testFile = new File("testFile.txt");
        if (!testFile.exists())
            testFile.createNewFile();

        FileOutputStream stream = new FileOutputStream(testFile);
        stream.write("Программист это человек, преобразующий кофе в код".getBytes());

        readWrite("testFile.txt");
        revers("testFile.txt");
        wordReplace("testFile.txt","человек","девушка");



    }

    public static void readWrite(String path) {

        try {
            File file = new File(path);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (bufferedReader.ready()) {

                String string = bufferedReader.readLine();
                FileOutputStream newFile = new FileOutputStream("newFile");
                newFile.write(string.toUpperCase().getBytes());

                System.out.println("New file is ready");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.fillInStackTrace();
        }
    }

    public static void revers(String path) {

        try {
            File file = new File(path);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (bufferedReader.ready()) {

                String string = bufferedReader.readLine();
                FileOutputStream newFile = new FileOutputStream("newFile");
                String reversString = reversString(string);
                newFile.write(reversString.getBytes());

                System.out.println("New file is ready");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.fillInStackTrace();
        }

    }
    //    Создать программу, которая читает содержимое
//.txt файла и записывает все строки в обратном порядке
//    в другой .txt файл. То есть последняя строка исходного файла
//    станет первой строкой выходного файла и так далее.
    private static String reversString(String string){
        Stack<Character> stack = new Stack<>();
        String result = "";
        for (Character character:string.toCharArray()) {
            stack.add(character);
        } while (!stack.isEmpty()){
            result = result + stack.pop();
        }
        return result;
    }

//    Написать Java-программу, которая читает файл, находит в нём все
//    вхождения заданного слова и заменяет его на другое слово, указанное
//    пользователем. Изменённый текст записать в новый файл.

    public static void wordReplace(String path, String searchWord, String newWord) {

        try {
            File file = new File(path);
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (bufferedReader.ready()) {

                String string = bufferedReader.readLine();
                FileOutputStream newFile = new FileOutputStream("newFile");
                //List<String> strList = Collections.singletonList(string);
                //String search = searchWord;
                String replace = string.replace(searchWord,newWord);
//                for (String word:strList) {
//                    if(word.equals(search)){
//                        word = replace;
//
//                    }
//                }


                newFile.write(replace.getBytes());

                System.out.println("New file is ready");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.fillInStackTrace();
        }

    }


//    private static String reversStringRecurs(String string){
//        if(string.length() <= 1){
//            return string;
//        }
//        return reversStringRecurs(string.substring(1) +
//                string.charAt(0));
//    }
}
class Task_2{
//    Создать программу, которая читает содержимое
//.txt файла и записывает все строки в обратном порядке
//    в другой .txt файл. То есть последняя строка исходного файла
//    станет первой строкой выходного файла и так далее.
public static void main(String[] args) {

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


//    Написать программу на Java, которая читает текст из
//.txt файла, преобразует каждую букву в верхний регистр и
//    записывает результат в новый .txt файл.



