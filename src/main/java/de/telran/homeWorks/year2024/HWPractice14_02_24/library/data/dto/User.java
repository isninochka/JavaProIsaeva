package de.telran.homeWorks.year2024.HWPractice14_02_24.library.data.dto;

import lombok.Getter;

import java.util.HashMap;
import java.util.Map;



@Getter
public class User {

    private String firstName;
    private String lastName;


    private Map<Book,Boolean> usersBooks;

    public User(String firstName, String lastName) {
       this.firstName = firstName;
        this.lastName = lastName;
        this.usersBooks = new HashMap<>();
    }




}
