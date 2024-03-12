package de.telran.lessons_Nikolay.lesson06_03_24.task2;

import lombok.AllArgsConstructor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class QuestionReader {
    private String fileName;

    public List<Question> readQuestions(String fileName) {
        List<Question> questions = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {


              //  questions.add(question);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return questions;


    }

}
