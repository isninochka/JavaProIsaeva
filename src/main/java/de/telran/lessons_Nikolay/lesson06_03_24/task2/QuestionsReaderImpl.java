package de.telran.lessons_Nikolay.lesson06_03_24.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuestionsReaderImpl implements QuestionsReaderInterface{
    private final List<Question>QUESTIONS = new ArrayList<>();

    public QuestionsReaderImpl() {
    }

    public void readQuestions(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            Scanner scanner = new Scanner(System.in);

            while ((line = br.readLine()) != null) {
                Pattern pattern = Pattern.compile("(.+?):(.+):(.*?)");
                Matcher matcher = pattern.matcher(line);
                if (matcher.find()) {
                    String question = matcher.group(1).trim();
                    String answers = matcher.group(2).trim();
                    String correctAnswer = matcher.group(3).trim();


                    System.out.println("Question: " + question);
                    System.out.println("Answer: " + answers);
                    String clientAnswer = scanner.nextLine();
                    if (clientAnswer.equalsIgnoreCase(correctAnswer)) {
                        System.out.println("True");
                    } else {
                        System.out.println("False");
                    }
                    System.out.println();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public List<Question> getQuestions() {
        return Collections.unmodifiableList(QUESTIONS);
    }
}
