package de.telran.homeWorks.year2024.HWPractice14_02_24.library.data.dto;

import lombok.Data;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;



@Data
public class User {

    private Book book;

    private String firstName;

    private String lastName;


    public User(String firstName, String lastName) {
       this.firstName = firstName;
        this.lastName = lastName;

    }




}
